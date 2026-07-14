package com.movieProject.movie_management.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieRequestDTO {

    @NotBlank(message = "Title cannot be empty ... ")
    String title;
    @NotBlank(message = "Genre cannot be empty ... ")
    String genre;
    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("10.0")
    Double rating;
    @NotNull(message = "year cannot be empty ... ")
    @Min(value = 1900)
    @Max(value=2026)
    Integer year;
}
