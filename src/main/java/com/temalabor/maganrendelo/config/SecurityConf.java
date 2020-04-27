package com.temalabor.maganrendelo.config;

import com.temalabor.maganrendelo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@EnableWebSecurity
@Configuration
public class SecurityConf extends WebSecurityConfigurerAdapter {


    @Bean
    public UserDetailsService userDetailsService() {
        return super.userDetailsService();
    }

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/admin/**").hasAuthority("ADMIN")
                    .antMatchers("/doctor/**").hasAuthority("DOCTOR")
                    .antMatchers("/patient/**").hasAuthority("PATIENT")
                    .antMatchers("/surgery/**").permitAll()
                    .antMatchers("/registration").permitAll()
                    .antMatchers("/").permitAll()
                    .antMatchers("/home").permitAll()
                    .antMatchers("/surgeries").permitAll()
                    .antMatchers("/login").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .httpBasic();

                /*.formLogin()
                    //.loginPage("/login")
                    .permitAll()
                    .and()
                .logout()
                    .logoutSuccessUrl("/login?logout")
                    .permitAll()*/;
    }
}
