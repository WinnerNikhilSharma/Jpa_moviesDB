package com.hibernate.Jpa.hibernate.Jpa.Service;

import com.hibernate.Jpa.hibernate.Jpa.Model.Movie;
import com.hibernate.Jpa.hibernate.Jpa.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
