package com.aditi.movie_review.movies; //Package this Java class belongs to

import org.springframework.boot.SpringApplication; // Contains the run() method
import org.springframework.boot.autoconfigure.SpringBootApplication; // This imports the Spring Boot application annotation. Annotations in Java are usually used in Java to let the compiler know about what your class does.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Annotation that lets the framework know that this class is a REST API controller
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args); // Call run() and pass application class to it

	}

}

