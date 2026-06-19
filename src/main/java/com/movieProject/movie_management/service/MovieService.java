package com.movieProject.movie_management.service;

import com.movieProject.movie_management.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    ArrayList<Movie> movieList=new ArrayList<>();
    private int idCounter= 1;
    public List<Movie> getAllMovies(){
           return  movieList;
    }

    public Movie addMovie(Movie movie){
        movie.setId(idCounter++);
        movieList.add(movie);
        return movie;
    }

    public Movie getMovieById(Integer id) {
        for(Movie movie: movieList){
            if(movie.getId().equals(id)){
                return movie;
            }
        }
        return null;
    }

    public Movie updateMovie(Movie movie){
         for(int i=0;i<movieList.size();i++){
             if(movieList.get(i).getId().equals(movie.getId())){
                 return movieList.set(i,movie);
             }
         }
         return null;
    }

    public String deleteMovie(Integer id) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getId().equals(id)) {
                movieList.remove(i);

                return "Movie deleted successfully";
            }
        }
        return "Movie not found in the list ";
    }

}
