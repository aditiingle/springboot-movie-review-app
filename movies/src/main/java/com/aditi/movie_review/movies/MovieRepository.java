package com.aditi.movie_review.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId); // You can form dynamic queries using any property name in your model class if and only if the property is unique.
}


