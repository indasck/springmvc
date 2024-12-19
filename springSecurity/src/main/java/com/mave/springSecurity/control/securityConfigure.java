package com.mave.springSecurity.control;

import java.beans.Customizer;

import org.springframework.boot.web.server.Http2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@Configuration
@EnableWebSecurity
public class securityConfigure {
 
	
//	@Bean
//	InMemoryUserDetailsManager UserDetailsManager(){
//		
//		User.UserBuilder admin= User.withDefaultPasswordEncoder();
//				
//				UserDetails user= admin
//				            .username("user")
//				            .password("password")
//				            .authorities("admin")
//				            .build();
//		UserDetails user1= User.builder()
//				             .username("user1")
//				             .password("password")
//				             .authorities("user1")
//				             .build();
//		return new InMemoryUserDetailsManager(user,user1);
//	}
//
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http
	        .authorizeHttpRequests(requests -> requests
	            .requestMatchers("/pen", "/pencil", "/book").authenticated()
	            .requestMatchers("/contact", "/notice").permitAll()
	        )
	        .httpBasic();
	       
	    return http.build();
	}
}
