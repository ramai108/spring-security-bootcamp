package it.learning.spring.backendservicesbank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain (HttpSecurity http) throws Exception {

        /**
         * Custom configuration
         */

        http.authorizeHttpRequests()
                .requestMatchers("/myAccount","/myBalance","/myLoans","myCards").authenticated()
                .requestMatchers("/notices","/contact").permitAll()
                .and().formLogin()
                .and().httpBasic();

        /**
         * Custom configuration to deny all requests
         */

        /*
            http.authorizeHttpRequests().anyRequest().denyAll()
                .and().formLogin()
                .and().httpBasic();
        */

        /**
         * Configuration to permit all the requests
         */

        /*
          http.authorizeHttpRequests().anyRequest().permitAll()
             .and().formLogin()
             .and().httpBasic();
        */

        return http.build();
    }

}
