//package com.example.quote.service.config;
//
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
//
//@Configuration
////@ComponentScan("com.journaldev.spring")
//public class AppConfig {
//
//    @Bean
//    RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate();
//        MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
//        converter.setObjectMapper(new ObjectMapper());
//        restTemplate.getMessageConverters().add(converter);
//        return restTemplate;
//    }
//}
