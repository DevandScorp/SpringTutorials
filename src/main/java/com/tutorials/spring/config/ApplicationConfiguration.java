package com.tutorials.spring.config;

import com.tutorials.spring.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean(name = "countryObj")
    public Country getCountry(){
        return new Country("India");
    }
}
