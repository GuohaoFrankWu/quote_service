package com.example.quote.service.config;


import com.example.quote.service.entity.RestApiEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuoteProperties {
    @Bean
    public RestApiEntity getRestApiEntity(){
        return new RestApiEntity();
    }


}
