package com.alltop.model;

import com.alltop.constants.MediaType;

public abstract class Media {
	
	private int id;
	private String author;
	private String event;
	private String description;
	private String timeStamp;
	private MediaType type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public MediaType getType() {
		return type;
	}
	public void setType(MediaType type) {
		this.type = type;
	}

}
