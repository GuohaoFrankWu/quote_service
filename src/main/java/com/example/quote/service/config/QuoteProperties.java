package com.example.quote.service.config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class QuoteProperties {
    @Bean
    public RestTemplate restTemplateBean(RestTemplateBuilder builder) {
        return builder.build();
    }


}