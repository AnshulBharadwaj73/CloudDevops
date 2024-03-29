package com.luv2code.springsecurity.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServeletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder builder){
        return builder.sources(SpringSecurityCustomUserRegistrationApplication.class);
    }
}