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
    @NotBlank(message = "Title cannot be empty ... ")
    private  String title;

    @Column(nullable = false,length = 30)
    @NotBlank(message = "Genre cannot be empty ... ")
    private  String genre;

    @Column(nullable = false,length = 30)
    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("10.0")
    private  Double rating;

    @Column
    @NotNull(message = "year cannot be empty ... ")
    @Min(value = 1900)
    @Max(value=2026)
    private Integer year;


}
