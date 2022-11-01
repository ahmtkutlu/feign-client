package com.ahmtkutlu.feign.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class SearchContext {

    @JsonAlias("Title")
    private String title;

    @JsonAlias("Year")
    private String year;

    @JsonAlias("imdbID")
    private String imdbId;

    @JsonAlias("Type")
    private String type;

    @JsonAlias("Poster")
    private String posterUrl;

}