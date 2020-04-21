package com.temalabor.maganrendelo.config;

/*

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConf extends WebSecurityConfigurerAdapter {

    */
/*@Autowired
    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .inMemoryAuthentication()
                    .withUser("patient1")
                    .password("{noop}pass")
                    .roles("PATIENT")
                .and()
                    .withUser("admin")
                    .password("{noop}abc123")
                    .roles("ADMIN");
    }*//*


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/registration").permitAll()
                    .antMatchers("/").permitAll()
                    .antMatchers("/home").permitAll()
                    .antMatchers("/surgery/**").permitAll()
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/doctor/**").hasRole("DOCTOR")
                    .antMatchers("/patient/**").hasRole("PATIENT")
                    .anyRequest().authenticated()
                .and()
                    .formLogin()
                        //.loginPage("/login")
                        .permitAll()
                .and()
                        .logout()
                        .logoutSuccessUrl("/login?logout")
                        .permitAll();
    }
}

*/
