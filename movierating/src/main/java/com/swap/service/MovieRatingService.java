package com.swap.service;

import com.swap.model.MovieRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MovieRatingService {
    @GetMapping("/movieRating/{movieName}")
    public List<MovieRating> getMovieRating(@PathVariable String movieName) {
        List<MovieRating> lst = Arrays.asList(
                new MovieRating("Nayak", 3),
                new MovieRating("Bhayanak", 2));
        return lst;
    }
}
