package com.example.quote.service.controllers;


import com.example.quote.service.services.QuoteRetrieveService;
import com.example.quote.service.services.dto.QuoteResponseEntity;
import com.example.quote.service.services.dto.Qutd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    QuoteRetrieveService quoteRetrieveService;


    @GetMapping(path = "/random/quote")
    public @ResponseBody Qutd getRandomQuote(){
        Qutd qutd = quoteRetrieveService.getRandomQuote();
        return qutd;
    }

    @GetMapping(path = "achieve/quotes/from/database")
    public @ResponseBody QuoteResponseEntity getAllAchieveQuotes(){
        return new QuoteResponseEntity();
    }

}
