package com.temalabor.maganrendelo.service;

/*
import com.temalabor.maganrendelo.model.LoginData;
import com.temalabor.maganrendelo.repository.LoginDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    LoginDataRepository loginDataRepo;

    @Autowired
    public void setLoginDataRepo(LoginDataRepository loginDataRepo) {
        this.loginDataRepo = loginDataRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginData user = loginDataRepo.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserDetailsImpl(user);
    }


}
*/
