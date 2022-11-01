package com.ahmtkutlu.feign.client;

import com.ahmtkutlu.feign.model.SearchData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="omdbapi-client", url = "http://www.omdbapi.com")
public interface MovieFeignClient {

    @GetMapping("/?apikey=yourApiKey={term}")
    SearchData searchMovies(@PathVariable String term);

}
