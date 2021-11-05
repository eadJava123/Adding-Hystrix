package com.example.courseinformation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.courseinformation")
@PropertySource("application.properties")
public class SpringConfig {

}
