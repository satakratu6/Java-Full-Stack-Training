package com.capg.springboot.dao;

import java.util.List;
import com.capg.springboot.entity.Movie;

public interface MovieDaoI {

    Movie createMovie(Movie movie);

    Movie findMovieById(long movieId);

    Movie updateMovie(Movie movie);

    List<Movie> findAllMovies();

    void deleteMovie(long movieId);
}