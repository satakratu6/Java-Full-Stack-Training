package com.capg.springboot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.springboot.entity.Movie;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDaoI {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Movie createMovie(Movie movie) {
        return entityManager.merge(movie);
    }

    @Override
    public Movie findMovieById(long movieId) {
        return entityManager.find(Movie.class, movieId);
    }

    @Override
    public Movie updateMovie(Movie movie) {

        Movie m = findMovieById(movie.getMovieId());

        m.setMovieName(movie.getMovieName());
        m.setMoviePrice(movie.getMoviePrice());
        m.setHero(movie.getHero());

        m = entityManager.merge(m);

        return m;
    }

    @Override
    public List<Movie> findAllMovies() {

        Query q = entityManager.createQuery("select m from Movie m");

        List<Movie> list = q.getResultList();

        return list;
    }

    @Override
    public void deleteMovie(long movieId) {

        Movie m = entityManager.find(Movie.class, movieId);

        entityManager.remove(m);
    }
}