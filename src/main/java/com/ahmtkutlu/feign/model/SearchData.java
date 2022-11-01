package com.ahmtkutlu.feign.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class SearchData {

    @JsonAlias("Search")
    private List<SearchContext> search;

}