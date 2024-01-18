package com.example.quote.service.services;

import com.example.quote.service.config.QuoteProperties;
import com.example.quote.service.entity.RestApiEntity;
import com.example.quote.service.exceptions.ExceptionResponse;
import com.example.quote.service.services.dto.Qutd;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.reactive.function.client.WebClient;


@Service
@PropertySource("classpath:application.properties")
@NoArgsConstructor
@Log4j2
public class QuoteRetrieveServiceImpl implements QuoteRetrieveService {

    @Value("${quote.random.url}")
    private String quoteRandomUrl;

    private WebClient client;

    public QuoteRetrieveServiceImpl(@Value("${quote.random.url}") String quoteRandomUrl){
        this.quoteRandomUrl = quoteRandomUrl;
    }

    @Autowired
    private RestApiEntity restApiEntity = new QuoteProperties().getRestApiEntity();


    @Override
    public Qutd getRandomQuote() {

        Qutd qutd = null;
        try {
            log.info("the url is " + quoteRandomUrl);
            qutd = restApiEntity.getObject(quoteRandomUrl, Qutd.class);
            log.info("the json response is " + qutd);
        } catch (RestClientException e) {
            log.error("there is a error in the getRandomQuote() " + e);
            throw new ExceptionResponse("there is a error in the getRandomQuote() ", e);
        }


        return qutd;
    }
}
