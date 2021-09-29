package com.example.movieapi.controller;

import com.example.movieapi.dto.MovieDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movies")
public class MovieController {

    @GetMapping("{id}")
    public MovieDto getMovie(@PathVariable Long id) {
        MovieDto movieDto = new MovieDto();
        movieDto.setTitle("Matrix");
        return movieDto;
    }

    @PostMapping
    public Long createMovie(@RequestBody MovieDto movieDto) {
        return 1L;
    }
}
