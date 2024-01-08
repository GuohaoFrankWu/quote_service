package com.example.quote.service.services;

import com.example.quote.service.Exceptions.ExceptionResponse;
import com.example.quote.service.services.dto.Qutd;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


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

    @Override
    public Qutd getRandomQuote() {

        Qutd qutd = null;
        try {
            log.info("the url is " + quoteRandomUrl);


            client = WebClient.create(quoteRandomUrl);

            Mono<Qutd> result = client.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(Qutd.class);
            qutd = result.toFuture().get();



            log.info("the json response is " + qutd);


        } catch (Exception e) {
            log.error("there is a error in the getRandomQuote() " + e);
            throw new ExceptionResponse();

        }


        return qutd;
    }
}
