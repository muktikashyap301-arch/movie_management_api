package com.movieProject.movie_management.service;

import com.movieProject.movie_management.dto.MovieRequestDTO;
import com.movieProject.movie_management.dto.MovieResponseDTO;
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
    public MovieResponseDTO save(MovieRequestDTO movieRequestDTO) {
        return movieRepo.save( movieRequestDTO);
    }

    @Override
    public List<MovieResponseDTO> findAllMovies() {
        return movieRepo.findAll();
    }

    @Override
    public MovieResponseDTO findById(Integer id) {
        return movieRepo.findById(id).orElseThrow(() -> new MovieNotFound("Movie not found by id : " + id));
    }

    @Override
    public MovieResponseDTO updatingMovie(Integer id, MovieRequestDTO movieRequestDTO) {
        Movie existingMovie = movieRepo.findById(id).orElseThrow(() -> new MovieNotFound("Movie not found by id : " + id));
        existingMovie.setId( movieRequestDTO.getId());
        existingMovie.setTitle(movieRequestDTO.getTitle());
        existingMovie.setGenre(movieRequestDTO.getGenre());
        existingMovie.setYear(movieRequestDTO.getYear());
        existingMovie.setRating(movieRequestDTO.getRating());
        return existingMovie;
    }

    @Override
    public String deleteById(Integer id) {
        movieRepo.deleteById(id);
        return "Movie deleted Successfully....";
    }
}
