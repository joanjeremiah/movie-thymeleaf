package com.joan.thymeleaf.movie.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joan.thymeleaf.movie.Movie;
import com.joan.thymeleaf.movie.Movies;
import com.joan.thymeleaf.movie.service.MovieApiCallService;

@Controller
public class MovieController {
	@Autowired
	private MovieApiCallService service;
	
	@GetMapping("/")
	public String index(Model model) {
		Movies trendingMovies = service.getTrendingMovies();
		Movies trendingTvShows = service.getTrendingTvShows();
		model.addAttribute("trendingMovies",trendingMovies);
		model.addAttribute("trendingTvShows",trendingTvShows);
		return "index";
	}
	@GetMapping("/movie/{id}")
	public String Movie(@PathVariable("id") int id,Model model) {
		Movie movie = service.getMovie(id);
		model.addAttribute("movie",movie);
		return "movie";
	}
	@GetMapping("/tv/{id}")
	public String TvShow(@PathVariable("id") int id,Model model) {
		Movie movie = service.getTvShow(id);
		model.addAttribute("movie",movie);
		return "movie";
	}
	@PostMapping("/search")
	public String search(Model model,@RequestParam Map<String, String> body) {
//		System.out.print(body.get("term"));
		Movies searchResults= service.search(body.get("term"));
		System.out.print(searchResults.toString());
		model.addAttribute("searchResults",searchResults);
		model.addAttribute("searchKey",body.get("term"));
		return "search";
	}
}
