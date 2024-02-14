package com.model;

public class Movie 
{
	private int movieId;
	private String movieName;
	private int price;
	private float rating;
	private String genre;
	
	public Movie(int movieId, String movieName , int price,float rating, String genre)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.price=price;
		this.rating=rating;
		this.genre=genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public float getRating()
	{
		return rating;
	}
	public void setRating(float rating)
	{
		this.rating=rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Id=" + movieId + "   Name=" + movieName + "   price=" + price + "   rating=" + rating
				+ "   genre=" + genre;
	}
	
	
	

}
