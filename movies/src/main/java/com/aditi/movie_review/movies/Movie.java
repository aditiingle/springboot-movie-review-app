package com.aditi.movie_review.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data // Annotation from the Lombok project. Sets all getters, setters, and toString methods.
@AllArgsConstructor // Annotation for creating a constructor that takes all the private fields as constructors
@NoArgsConstructor
public class Movie {
        @Id // Annotate ID field, lets framework now that the ObjectId property should be treated as the unique identifier for each movie in the DB
        private ObjectId id; // Represents ID of the movie
        private String imdbId; // Represents imdb ID of the movie
        private String title;
        private String releaseDate;
        private String trailerLink;
        private String poster;
        private List<String> genres;
        private List<String> backdrops;
        @DocumentReference // Annotation causes the DB to store only the IDs of the reviews and the reviews will be in a separate collection - called: Manual Reference Relationship
        private List<Review> reviewIds;
}
