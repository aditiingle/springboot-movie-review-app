package com.aditi.movie_review.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
        @Autowired // Annotation to initialize movieRepository. Lets framework know that it needs to instantiate the MovieRepository class.
        private MovieRepository movieRepository;
        public List<Movie> allMovies() {
            return movieRepository.findAll(); // findAll() is described inside the MongoRepository class
        }

        public Optional<Movie> singleMovie(String imdbId) { // findById() method may not find an ID at all, so it will have to return null. Optional<Movie> lets Java know it may return null .
            return movieRepository.findMovieByImdbId(imdbId);
        }
}
