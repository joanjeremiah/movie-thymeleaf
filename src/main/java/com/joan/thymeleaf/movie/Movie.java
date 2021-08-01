package com.joan.thymeleaf.movie;

import java.util.List;

public class Movie {
	private int id;
	private String overview;
	private String backdrop_path;
	private String poster_path;
	private String title;
	private float vote_average;
	private String release_date;
	private String tagline;
	private String media_type;
	private List<Genre> genres;
	
	public Movie() {
		super();
	}
	
	public Movie(int id, String overview, String backdrop_path, String poster_path, String title, float vote_average,
			String release_date, String tagline, String media_type, List<Genre> genres) {
		super();
		this.id = id;
		this.overview = overview;
		this.backdrop_path = backdrop_path;
		this.poster_path = poster_path;
		this.title = title;
		this.vote_average = vote_average;
		this.release_date = release_date;
		this.tagline = tagline;
		this.media_type = media_type;
		this.genres = genres;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getVote_average() {
		return vote_average;
	}
	public void setVote_average(float vote_average) {
		this.vote_average = vote_average;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getMedia_type() {
		return media_type;
	}
	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}
	public List<Genre> getGenres() {
		return genres;
	}
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", overview=" + overview + ", backdrop_path=" + backdrop_path + ", poster_path="
				+ poster_path + ", title=" + title + ", vote_average=" + vote_average + ", release_date=" + release_date
				+ ", tagline=" + tagline + ", media_type=" + media_type + ", genres=" + genres + "]";
	}
	
	
	
}
