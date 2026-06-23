package com.movieProject.movie_management.service;

import com.movieProject.movie_management.entity.Movie;

import java.util.List;

public interface MovieService {

    Movie save(Movie movie);
    List<Movie> findAllMovies();
    Movie findById(Integer id);
    Movie updatingMovie(Integer id,Movie movie);
    String deleteById(Integer id);
}
