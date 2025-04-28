package com.aditi.movie_review.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies") // Instead of mapping to localhost:8080, map to this endpoint. So, any requests to this endpoint will be handled by this controller
public class MovieController {
    @Autowired
    private MovieService movieService; // Reference to the MovieService class
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() { //
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }


    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) { // @PathVariable lets Spring take a value from the URL and use it as a method input, like an ObjectId or String.

        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}


