package com.in28minutes.rest.webservices.resftfulwebservices.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //make all request be athenticated
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

        //make a web page is shown if a request is not authenticated
        http.httpBasic(withDefaults());

        //CSRF -> Post, Put
        http.csrf().disable();
        return http.build();
    }
}
