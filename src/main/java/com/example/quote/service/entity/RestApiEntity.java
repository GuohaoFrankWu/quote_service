package com.example.quote.service.entity;

import lombok.Data;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Data
public class RestApiEntity {


    RestTemplate restTemplate;


    public <T> ResponseEntity<T> getEntity(String url, RequestEntity<T> requestEntity, Class<T> tClass){
        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, tClass);
    }


    public <T> ResponseEntity<T> postEntity(String url, RequestEntity<T> requestEntity, Class<T> tClass){
        return restTemplate.exchange(url, HttpMethod.POST, requestEntity, tClass);
    }

    public <T> ResponseEntity<T> putEntity(String url, RequestEntity<T> requestEntity, Class<T> tClass){
        return restTemplate.exchange(url, HttpMethod.PUT, requestEntity, tClass);
    }

    public <T> ResponseEntity<T> deleteEntity(String url, RequestEntity<T> requestEntity, Class<T> tClass){
        return restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, tClass);
    }


}