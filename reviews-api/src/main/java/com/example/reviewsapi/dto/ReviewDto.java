package com.example.reviewsapi.dto;

import java.util.List;
import lombok.Data;

@Data
public class ReviewDto {
    private String email;
    private String firstName;
    private String lastName;
    private List<MovieDto> movies;
}
