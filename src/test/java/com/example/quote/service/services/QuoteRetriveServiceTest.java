package com.example.quote.service.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@TestPropertySource("classpath:test.properties")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class QuoteRetriveServiceTest {

    @InjectMocks
    private QuoteRetrieveServiceImpl quoteRetrieveService;




    @BeforeEach
    void setUp(){

        quoteRetrieveService = new QuoteRetrieveServiceImpl("https://favqs.com/api/qotd");
    }

    @Test
    public void test_getting_random_quote_success() throws Exception {
        assertNotNull(quoteRetrieveService.getRandomQuote());

    }












}
