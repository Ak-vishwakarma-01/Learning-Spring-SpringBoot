package com.springsecurity.springSecurity;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // if there are so many beans then we use bean
public class SpringConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    //this interface provided by springboot to create custum user
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.builder()
                .username("ankit")
                .password(passwordEncoder().encode("1234"))
                .roles("ADMIN")
                .build();

        UserDetails user = User.builder()
                .username("rohan")
                .password(passwordEncoder().encode("2345"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin,user);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {

        return security
                .authorizeHttpRequests(auth->auth
                        .requestMatchers("/home").permitAll() //request from home availble for all (means without login)
                        .requestMatchers("/admin/***").hasRole("ADMIN")// request form admin only available for admin
                        .requestMatchers("/user/***").hasRole("USER").anyRequest()
                        .authenticated())
                .formLogin(form->form.permitAll())
                .build();
    }

}
