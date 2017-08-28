package com.pojo;

public class Studentpojo {
	protected  int id;
	protected String name;

	public Studentpojo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Studentpojo() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Studentpojo [id=" + id + ", name=" + name +"]";
	}
	
}