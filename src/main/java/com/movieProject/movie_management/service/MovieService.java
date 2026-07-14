package com.movieProject.movie_management.service;

import com.movieProject.movie_management.dto.MovieRequestDTO;
import com.movieProject.movie_management.dto.MovieResponseDTO;

import java.util.List;

public interface MovieService {

    MovieResponseDTO save(MovieRequestDTO movieRequestDTO);
    List<MovieResponseDTO> findAllMovies();
    MovieResponseDTO findById(Integer id);
    MovieResponseDTO updatingMovie(Integer id,MovieRequestDTO movieRequestDTO);
    String deleteById(Integer id);
}
