package com.example.reviewsapi.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MovieDto {
    private String title;
    private String directorName;
    private LocalDateTime releaseDate;
    private Byte userRating;
    private String userComment;
}
