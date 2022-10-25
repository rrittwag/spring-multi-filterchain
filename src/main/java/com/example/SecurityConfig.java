package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Configuration
    @Order(1)
    public class Alpha {
        @Bean
        public SecurityFilterChain alphaFilterChain(HttpSecurity http) throws Exception {
            http
                    .authorizeHttpRequests((authorize) -> authorize
                            .requestMatchers("/alpha").permitAll());
            return http.build();
        }
    }

    @Configuration
    @Order(2)
    public class Bravo {
        @Bean
        public SecurityFilterChain bravoFilterChain(HttpSecurity http) throws Exception {
            http
                    .authorizeHttpRequests((authorize) -> authorize
                            .requestMatchers("/bravo").permitAll());
            return http.build();
        }
    }
}
