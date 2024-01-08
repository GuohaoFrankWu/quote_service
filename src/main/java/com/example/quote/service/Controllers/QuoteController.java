package com.example.quote.service.Controllers;


import com.example.quote.service.services.QuoteRetrieveService;
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
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("content-type", "application/json; charset=utf-8");
        Qutd qutd = quoteRetrieveService.getRandomQuote();

        return qutd;
    }

}
