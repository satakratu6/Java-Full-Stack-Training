package com.capg.springboot.service;

import java.util.List;
import com.capg.springboot.entity.Movie;

public interface MovieServiceI {

    Movie createMovie(Movie movie);

    Movie findMovieById(long movieId);

    Movie updateMovie(Movie movie);

    List<Movie> findAllMovies();

    void deleteMovie(long movieId);
}