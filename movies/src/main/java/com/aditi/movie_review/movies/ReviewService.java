package com.aditi.movie_review.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate; // Used to form a new dynamic query and do the job inside the DB without using the repository.
    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody)); // insert returns the data pushed inside the DB

        mongoTemplate.update(Movie.class) // Update reviews by reviewId
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;

    }
}
