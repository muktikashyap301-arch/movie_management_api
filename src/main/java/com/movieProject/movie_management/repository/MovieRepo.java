package com.movieProject.movie_management.repository;

import com.movieProject.movie_management.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Integer> {


}
