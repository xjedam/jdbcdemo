package com.example.jdbcdemo.domain;

public class Car {
	private String model;
	private String make;
	private Long id;
	private int yop;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	
}
