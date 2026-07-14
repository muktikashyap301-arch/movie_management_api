package com.movieProject.movie_management.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private Integer year;


}
