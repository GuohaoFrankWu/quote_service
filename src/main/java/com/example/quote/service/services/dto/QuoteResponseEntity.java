package com.example.quote.service.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuoteResponseEntity {
    public ArrayList<Quote> quoteArrayList;
    public Integer count;

    public Integer getCounts(){
        count = quoteArrayList.size();
        return count;
    }
}
