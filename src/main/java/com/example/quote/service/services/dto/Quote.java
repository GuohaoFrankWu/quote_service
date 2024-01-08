package com.example.quote.service.services.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    @JsonProperty("id")
    public String id;
    @JsonProperty("dialogue")
    public Boolean dialogue;
    @JsonProperty("private")
    public Boolean Private;
    @JsonProperty("tags")
    public ArrayList<String> tags;
    @JsonProperty("url")
    public String url;
    @JsonProperty("favorites_count")
    public String favorites_count;
    @JsonProperty("upvotes_count")
    public String upvotes_count;
    @JsonProperty("downvotes_count")
    public String downvotes_count;
    @JsonProperty("author")
    public String author;
    @JsonProperty("author_permalink")
    public String author_permalink;
    @JsonProperty("body")
    public String body;
}
