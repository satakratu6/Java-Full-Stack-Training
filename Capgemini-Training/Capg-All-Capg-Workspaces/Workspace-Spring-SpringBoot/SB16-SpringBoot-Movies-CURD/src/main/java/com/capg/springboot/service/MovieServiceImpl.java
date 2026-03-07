package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.dao.MovieDaoI;
import com.capg.springboot.entity.Movie;

@Service
public class MovieServiceImpl implements MovieServiceI {

    @Autowired
    private MovieDaoI dao;

    @Override
    public Movie createMovie(Movie movie) {
        return dao.createMovie(movie);
    }

    @Override
    public Movie findMovieById(long movieId) {
        return dao.findMovieById(movieId);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        return dao.updateMovie(movie);
    }

    @Override
    public List<Movie> findAllMovies() {
        return dao.findAllMovies();
    }

    @Override
    public void deleteMovie(long movieId) {
        dao.deleteMovie(movieId);
    }
}