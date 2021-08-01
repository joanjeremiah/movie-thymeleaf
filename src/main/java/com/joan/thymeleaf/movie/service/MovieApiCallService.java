package com.joan.thymeleaf.movie.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.joan.thymeleaf.movie.Movie;
import com.joan.thymeleaf.movie.Movies;

@Service
public class MovieApiCallService {
	public Movies getTrendingMovies() {
		ResponseEntity<Movies> response = new RestTemplate()
				.getForEntity("https://api.themoviedb.org/3/trending/movie/day?api_key=501edd6ec22a9765d383701b1b249e60",Movies.class);
		return response.getBody();
	}
	public Movies getTrendingTvShows() {
		ResponseEntity<Movies> response = new RestTemplate()
				.getForEntity("https://api.themoviedb.org/3/trending/tv/day?api_key=501edd6ec22a9765d383701b1b249e60",Movies.class);
		return response.getBody();
	}
	public Movie getMovie(int id) {
		ResponseEntity<Movie> response = new RestTemplate()
				.getForEntity("https://api.themoviedb.org/3/movie/"+id+"?api_key=501edd6ec22a9765d383701b1b249e60&language=en-US",Movie.class);
		return response.getBody();
	}
	public Movie getTvShow(int id) {
		ResponseEntity<Movie> response = new RestTemplate()
				.getForEntity("https://api.themoviedb.org/3/tv/"+id+"?api_key=501edd6ec22a9765d383701b1b249e60&language=en-US",Movie.class);
		return response.getBody();
	}
	public Movies search(String term) {
		 ResponseEntity<Movies> response= new RestTemplate()
				.getForEntity("https://api.themoviedb.org/3/search/multi?api_key=501edd6ec22a9765d383701b1b249e60&language=en-US&query=" + term + "&page=1&include_adult=false", Movies.class);
		 return response.getBody();
	}
}
