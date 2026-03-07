package com.capg.springboot.dao;

import java.util.List;

import com.capg.springboot.entities.Movie;

public class MovieDaol {
	Movie AddMovie(Movie movie);
	Movie findMovieById(long mId);
	Movie updateMovie(Movie movie); 
	List<Movie> findAllMovies();
	void deleteMovie(long mId);
}
}
