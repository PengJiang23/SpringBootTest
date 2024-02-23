package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class MvcConfiguration implements WebMvcConfigurer {



    public void addResourceHandlers(ResourceHandlerRegistration registry){

    }

}
