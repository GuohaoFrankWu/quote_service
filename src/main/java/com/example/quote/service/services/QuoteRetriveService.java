package com.example.quote.service.services;

import com.example.quote.service.entity.RestApiEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class QuoteRetriveService {
    RestApiEntity restApiEntity = new RestApiEntity();

    @Value("${quote.random.url}")
    String quoteRandomUrl;



}
