package com.example.springweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.example"},
                includeFilters = { @ComponentScan.Filter(Controller.class)})
public class WebConfig implements WebMvcConfigurer {

    public WebConfig(){
        System.out.println("webConfig 실행");
    }

}
