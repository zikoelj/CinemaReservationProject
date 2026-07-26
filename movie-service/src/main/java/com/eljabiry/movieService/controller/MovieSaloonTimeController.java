package com.eljabiry.movieService.controller;

import com.eljabiry.movieService.services.abstracts.MovieSaloonTimeService;
import com.eljabiry.movieService.entity.MovieSaloonTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie/movieSaloonTimes/")
//@CrossOrigin
public class MovieSaloonTimeController {

    public MovieSaloonTimeController(MovieSaloonTimeService movieSaloonTimeService) {
        this.movieSaloonTimeService = movieSaloonTimeService;
    }

    private final MovieSaloonTimeService movieSaloonTimeService;

    @GetMapping("getMovieSaloonTimeSaloonAndMovieId/{saloonId}/{movieId}")
    public List<MovieSaloonTime> getMovieSaloonTimeSaloonAndMovieId(@PathVariable int saloonId,
                                                                    @PathVariable int movieId) {
        return movieSaloonTimeService.getMovieSaloonTimeSaloonAndMovieId(saloonId, movieId);
    }
}
