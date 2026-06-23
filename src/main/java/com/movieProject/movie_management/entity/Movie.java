package com.movieProject.movie_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(nullable = false,length = 30)
    private  String title;

    @Column(nullable = false,length = 30)
    private  String genre;

    @Column(nullable = false,length = 30)
    private  Double rating;

    @Column
    private String year;

    //default constructor
    Movie(){

    }
    //parameterized constructor
    public Movie(Integer id, String title, String genre, Double rating, String year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    //setters
    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public void setYear(String year) {
        this.year = year;
    }

    //getters
    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public Double getRating() {
        return rating;
    }
    public String getYear() {
        return year;
    }
}
