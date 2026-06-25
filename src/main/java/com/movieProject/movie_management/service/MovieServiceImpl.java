package com.movieProject.movie_management.service;

import com.movieProject.movie_management.entity.Movie;
import com.movieProject.movie_management.exception.MovieNotFound;
import com.movieProject.movie_management.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepo movieRepo;


    @Override
    public Movie save(Movie movie) {
        return movieRepo.save(movie);
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepo.findAll();
    }

    @Override
    public Movie findById(Integer id) {
        return movieRepo.findById(id).orElseThrow(() -> new MovieNotFound("Movie not found by id : " + id));
    }

    @Override
    public Movie updatingMovie(Integer id, Movie movie) {
        Movie existingMovie = movieRepo.findById(id).orElseThrow(() -> new MovieNotFound("Movie not found by id : " + id));
        existingMovie.setId(movie.getId());
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setGenre(movie.getGenre());
        existingMovie.setYear(movie.getYear());
        existingMovie.setRating(movie.getRating());
        return existingMovie;
    }

    @Override
    public String deleteById(Integer id) {
        movieRepo.deleteById(id);
        return "Movie deleted Successfully....";
    }
}
