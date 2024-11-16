package com.example.demo.Pojp;

public class Shows {
	private int size;
	private String brand;
	private String name;
	private Double cost;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Shows [size=" + size + ", brand=" + brand + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
