package com.Artwork;

public class Artwork {
	public int id;
	public String title;
	public String category;
	public String description;

// Constructor to initialize an artwork object
	public Artwork(int id, String title, String category, String description) {
		this.title = title;
		this.category = category;
		this.description = description;
	}
	
	// String representation for easy printing in console
	@Override
	public String toString() {
		return id+ "|" + title+"|"+category+"|" + description;
	}
	

	}


