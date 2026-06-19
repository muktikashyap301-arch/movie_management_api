package com.movieProject.movie_management.controller;

import com.movieProject.movie_management.entity.Movie;
import com.movieProject.movie_management.service.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieService.getAllMovies()) ;

    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getMovieById(@PathVariable Integer id){
        Movie getMovie= movieService.getMovieById(id);
        if(getMovie==null){
            return ResponseEntity.status(404).body("Movie not found");
        }
        return ResponseEntity.ok(getMovie);
    }

    @PostMapping()

    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.status(201).body(movieService.addMovie(movie));
    }

    @PutMapping()
    public ResponseEntity<Object> updateMovie( @RequestBody Movie movie){
        Movie getMovie= movieService.updateMovie(movie);
        if(getMovie==null){
            return ResponseEntity.status(404).body("Movie not found");
        }
        return ResponseEntity.ok(getMovie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable Integer id){
        String result= movieService.deleteMovie(id);

        if(result.equals("Movie not found in the list ")){
            return ResponseEntity.status(404).body(result);
        }
        return ResponseEntity.ok(result);
    }

}
