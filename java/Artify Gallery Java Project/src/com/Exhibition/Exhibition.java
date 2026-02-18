package com.Exhibition;

public class Exhibition {
	public int id;
	public String name;
	public String theme;
	public String date;
	
	// Constructor to initialize an exhibition object
	public Exhibition(int id, String name, String theme, String date) {
		this.id = id;
		this.name = name;
		this.theme = theme;
		this.date = date;
	}

	// String representation for easy printing in console
	@Override
	public String toString() {
		return id +"|" + name + "|" + theme + "|" + date;
	}

	}


