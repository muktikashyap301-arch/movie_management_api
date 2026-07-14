package com.movieProject.movie_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponseDTO {

    Integer id;
    String title;
    String genre;
    Double rating;
    Integer year;
}
