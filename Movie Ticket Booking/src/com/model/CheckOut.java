package com.model;

public class CheckOut 
{
	String movieName;
	int moviePrice;
	
	
	
	public CheckOut(String movieName, int moviePrice) 
	{
		this.movieName = movieName;
		this.moviePrice = moviePrice;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public int getMoviePrice() {
		return moviePrice;
	}


	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}


	@Override
	public String toString() {
		return "Item Name=" + movieName + "\tPrice=" + moviePrice;
	}

	
	
	
}
