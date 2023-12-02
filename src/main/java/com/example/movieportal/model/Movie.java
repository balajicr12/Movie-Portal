package com.example.movieportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Movie {
	@Id
	private Integer movieId;
	private String name;
	private String hero;
	private String director;
	private String language;
	private String musicDirector;
	private String ott;
	private String producer;
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMusicDirector() {
		return musicDirector;
	}
	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}
	public String getOtt() {
		return ott;
	}
	public void setOtt(String ott) {
		this.ott = ott;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	

}
