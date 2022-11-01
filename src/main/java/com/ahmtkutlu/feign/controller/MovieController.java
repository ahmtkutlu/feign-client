package com.ahmtkutlu.feign.controller;

import com.ahmtkutlu.feign.client.MovieFeignClient;
import lombok.RequiredArgsConstructor;
import com.ahmtkutlu.feign.model.SearchData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieFeignClient feignClient;

    //http://localhost:8044/movies/search/batman
    @GetMapping("/search/{term}")
    public SearchData searchMovies(@PathVariable String term){
        return feignClient.searchMovies(term);
    }

}
