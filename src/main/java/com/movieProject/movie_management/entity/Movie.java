package com.movieProject.movie_management.entity;

public class Movie {

    private  Integer id;
    private  String title;
    private  String genre;
    private  Double rating;
    private int year;

    //default constructor
    Movie(){}
    //parameterized constructor
    public Movie(Integer id, String title, String genre, Double rating, Integer year) {
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
    public void setYear(int year) {
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
    public Integer getYear() {
        return year;
    }
}
