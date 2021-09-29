package com.example.reviewsapi.controller;

import com.example.reviewsapi.client.MovieClient;
import com.example.reviewsapi.dto.MovieDto;
import com.example.reviewsapi.dto.ReviewDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("reviews")
public class ReviewController {

    private final MovieClient movieClient;

    @GetMapping("users/{id}/movies")
    public List<ReviewDto> getAllReviews(@PathVariable Long id) {
        return List.of(new ReviewDto());
    }

    @PostMapping("users/{userId}/movies/{movieId}")
    public Long createUserReviewForMovie(@PathVariable Long userId, @PathVariable Long movieId) {
        MovieDto movie = movieClient.getMovie(movieId);
        return 1L;
    }
}
