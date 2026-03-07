package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.capg.springboot.entity.Movie;
import com.capg.springboot.service.MovieServiceI;
import com.capg.springboot.dao.MovieNotFoundException;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieServiceI service;

    @PostMapping("/create")
    public ResponseEntity<Boolean> createMovie(@RequestBody Movie movie) {

        service.createMovie(movie);

        ResponseEntity<Boolean> responseEntity =
                new ResponseEntity<>(true, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping("/getdetails/{movieId}")
    public ResponseEntity<Movie> findMovieById(@PathVariable("movieId") long movieId) {

        Movie movie = service.findMovieById(movieId);

        if(movie == null){
            throw new MovieNotFoundException("Movie not found for id=" + movieId);
        }

        return new ResponseEntity<>(movie, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Movie>> findAllMovies(){

        List<Movie> list = service.findAllMovies();

        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){

        movie = service.updateMovie(movie);

        return new ResponseEntity<>(movie, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{movieId}")
    public String deleteMovie(@PathVariable("movieId") Long movieId){

        service.deleteMovie(movieId);

        return "Deleted";
    }
}