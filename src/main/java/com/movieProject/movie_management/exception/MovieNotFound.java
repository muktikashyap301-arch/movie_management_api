package com.movieProject.movie_management.exception;

public class MovieNotFound extends RuntimeException {
    public MovieNotFound(String message){
        super (message);
    }
}
