package com.Artist;

public class Artist {
	public int id;
	public String name;
	public String bio;

	public Artist(int id, String name, String bio) {
		this.id = id;
		this.name = name;
		this.bio = bio;
	}
	
	// String representation for easy printing in console
	@Override
	public String toString() {
		return id + "|" + name+ "|" +bio;
	}

}
