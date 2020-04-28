package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.PatientDto;
import com.temalabor.maganrendelo.service.PatientService;
import com.temalabor.maganrendelo.service.UserService;
import com.temalabor.maganrendelo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;*/
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;



@RestController
public class HomeController {

    private UserServiceImpl userService;

    @Autowired
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Autowired
    private PatientService patientService;

    @RequestMapping("/")
    public String index() { return "index"; }

    //regisztracios adatok kuldese
    @PostMapping("/registration")
    public void regPatient(@RequestBody PatientDto patientdto) {
        userService.registerUser(patientdto);
    }

    /*@RequestMapping("/profile")
    @ResponseBody
    public RedirectView userProfile(Authentication auth) {
        String url = userService.userProfile(auth);
        return new RedirectView(url);
    }*/

}
