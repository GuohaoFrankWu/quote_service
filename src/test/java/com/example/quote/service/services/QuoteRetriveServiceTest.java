package com.example.quote.service.services;

import com.example.quote.service.entity.RestApiEntity;
import com.example.quote.service.services.dto.Qutd;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.client.RestClientException;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;


@ExtendWith(MockitoExtension.class)
@TestPropertySource("classpath:test.properties")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class QuoteRetriveServiceTest {

    @InjectMocks
    private QuoteRetrieveServiceImpl quoteRetrieveService;

    @Mock
    RestApiEntity restApiEntity;





    @BeforeEach
    void setUp(){

        quoteRetrieveService = new QuoteRetrieveServiceImpl("https://favqs.com/api/qotd");
    }

    @Test
    public void test_getting_random_quote_success() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Qutd qutd = objectMapper.readValue(new FileReader("src/test/resources/quote.json"), Qutd.class);

        Mockito.lenient().when(restApiEntity.getObject(eq("https://favqs.com/api/qotd"), any())).thenReturn(qutd);
        assertNotNull(quoteRetrieveService.getRandomQuote());

    }

    @Test
    @Disabled
    public void test_getting_random_quote_fail() throws IOException, URISyntaxException {
        ObjectMapper objectMapper = new ObjectMapper();
        Qutd qutd = objectMapper.readValue(new FileReader("src/test/resources/quote.json"), Qutd.class);

        Mockito.lenient().doThrow(RestClientException.class).when(restApiEntity).getObject(anyString(), any());
        assertThrows(RestClientException.class, () -> quoteRetrieveService.getRandomQuote());

    }












}
