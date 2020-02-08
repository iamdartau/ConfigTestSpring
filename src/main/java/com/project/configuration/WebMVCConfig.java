package com.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration /*indicates to Spring that this is a configuration class
that will provide beans to the Spring application context*/
@EnableWebMvc /*we use MVC design, so let's notify Spring*/
@ComponentScan(basePackages = {"com.project"})/*This lets you declare other
classes with annotations like @Component, @Controller, @Service, and others,
to have Spring automatically discover them and register them as components in
the Spring application context.*/

public class WebMVCConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/views/");
        resourceViewResolver.setSuffix(".jsp");
        return resourceViewResolver;
    }
}
