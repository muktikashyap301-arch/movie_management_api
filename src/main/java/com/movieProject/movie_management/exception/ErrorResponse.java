package com.movieProject.movie_management.exception;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ErrorResponse {
    String Message;
    int status;
    LocalDateTime reportedTime;
}
