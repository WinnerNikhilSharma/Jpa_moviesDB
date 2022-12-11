package com.hibernate.Jpa.hibernate.Jpa.Controller;

import com.hibernate.Jpa.hibernate.Jpa.Model.Movie;
import com.hibernate.Jpa.hibernate.Jpa.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/explore/movies")
    public ResponseEntity<List<Movie>> getAllMovies() {
//        return movieService.getAllMovies();
      return new ResponseEntity<>(movieService.getAllMovies(),HttpStatus.ACCEPTED);
    }

    @PostMapping("/add-movies")
    public ResponseEntity addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
