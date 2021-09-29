package com.example.reviewsapi.client;

import com.example.reviewsapi.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "movie-api", url = "http://localhost:8082/movie-api")
public interface MovieClient {
    @RequestMapping(method = RequestMethod.GET, value = "/movies/{id}")
    MovieDto getMovie(@PathVariable Long id);
}
