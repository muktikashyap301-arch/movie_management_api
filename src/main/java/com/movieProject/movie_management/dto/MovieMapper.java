package com.movieProject.movie_management.dto;

import com.movieProject.movie_management.entity.Movie;

public class MovieMapper {


        // Convert RequestDTO → Entity (before saving)
        public static Movie toEntity(MovieRequestDTO dto){
            Movie newMovie=new Movie();
            newMovie.setTitle(dto.getTitle());
            newMovie.setGenre(dto.getGenre());
            newMovie.setRating(dto.getRating());
            newMovie.setYear(dto.getYear());
            return newMovie;
        }

        // Convert Entity → ResponseDTO (before returning)
        public static MovieResponseDTO toResponseDTO(Movie movie){
            MovieResponseDTO newMovieResponse=new MovieResponseDTO();
            newMovieResponse.setId(movie.getId());
            newMovieResponse.setTitle(movie.getTitle());
            newMovieResponse.setGenre(movie.getGenre());
            newMovieResponse.setRating(movie.getRating());
            newMovieResponse.setYear(movie.getYear());
            return newMovieResponse;

    }
}
