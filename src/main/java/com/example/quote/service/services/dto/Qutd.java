package com.example.quote.service.services.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Qutd {
    @JsonProperty("qotd_date")
    public Date qotd_date;
    @JsonProperty("quote")
    public Quote quote;

}
