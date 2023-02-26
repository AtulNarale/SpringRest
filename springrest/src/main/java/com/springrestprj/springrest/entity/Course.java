package com.springrestprj.springrest.entity;

public class Course {
	private long id;
	private String title;
	private String decsciption;
	
	public Course(long id, String title, String decsciption) {
		super();
		this.id = id;
		this.title = title;
		this.decsciption = decsciption;
	}

	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDecsciption() {
		return decsciption;
	}

	public void setDecsciption(String decsciption) {
		this.decsciption = decsciption;
	}
	
	

}
