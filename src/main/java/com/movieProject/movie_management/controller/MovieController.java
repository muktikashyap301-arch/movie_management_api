package com.movieProject.movie_management.controller;

import com.movieProject.movie_management.entity.Movie;
import com.movieProject.movie_management.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping()
    public Movie saveMovie(@Valid @RequestBody Movie movie){
        return movieService.save(movie);
    }

    @GetMapping
    public List<Movie>  getAllMovies(){
       return movieService.findAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById( @PathVariable Integer id ){
       return movieService.findById(id);
    }

    @PutMapping("/{id}")
    public Movie updateMovie( @PathVariable Integer id , @Valid @RequestBody Movie movie){
     return movieService.updatingMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable Integer id){
        return movieService.deleteById(id);

    }
}

