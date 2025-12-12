package com.mphasis.beans;


public class Movie {
	
	private int mid;
	private String mname;
	private String lang;
	private double rating;
	public Movie() {
		super();
	}
	public Movie(int mid, String mname, String lang, double rating) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.lang = lang;
		this.rating = rating;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", lang=" + lang + ", rating=" + rating + "]";
	}

	
}
