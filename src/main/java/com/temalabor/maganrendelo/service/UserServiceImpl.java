package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.model.LoginData;
import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.model.PatientDto;
import com.temalabor.maganrendelo.repository.DoctorRepository;
import com.temalabor.maganrendelo.repository.LoginDataRepository;
import com.temalabor.maganrendelo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import java.util.*;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private LoginDataRepository userRepository;
    private PatientRepository patientRepository;
    private DoctorRepository doctorRepository;

    private final String PATIENT_ROLE = "PATIENT";
    private final String DOCTOR_ROLE = "DOCTOR";

    @Autowired
    public UserServiceImpl(LoginDataRepository userRepository, PatientRepository patientRepository, DoctorRepository doctorRepository) {
        this.userRepository = userRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginData user = findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        org.springframework.security.core.userdetails.User u = new org.springframework.security.core.userdetails.User(
                user.getEmail(), encodePassword(user.getPass()), true, true, true,
                true, getAuthorities(user.getRole()));
        return u;
    }

    @Override
    public LoginData findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Collection<? extends GrantedAuthority> getAuthorities(String role) {
        Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(role));

        return authorities;
    }

    public void registerUser(PatientDto dto) {
        Patient patient = new Patient(dto.getFirstname(),dto.getLastname(),dto.getEmail(),dto.getTel(),dto.getTaj());
        LoginData user = new LoginData(dto.getEmail(),dto.getPass());

        user.setRole(PATIENT_ROLE);

        userRepository.save(user);
        patientRepository.save(patient);
    }

    public String encodePassword(String pass) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return encoder.encode(pass);
    }

    public String userProfile(Authentication authentication) {
        UserDetails user = (UserDetails) authentication.getPrincipal();
        List<String> authorities = new ArrayList<>();
        for (GrantedAuthority auth : user.getAuthorities()) {
            authorities.add(auth.getAuthority());
        }

        switch (authorities.get(0)) {
            case PATIENT_ROLE:
                Long patientId = patientRepository.findByEmail(user.getUsername()).getId();
                return "/patient/" + patientId;
            case DOCTOR_ROLE:
                Long doctorId = doctorRepository.findByEmail(user.getUsername()).getId();
                return "/doctor/" + doctorId;
            default:
                return "/error";
        }
    }
}
