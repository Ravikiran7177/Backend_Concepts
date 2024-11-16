package com.example.demo.Pojo;

public class Course {
	private String img;
	private String name;
	private String description;
	private String off;
	private double oldprice;
	private double newprice;
	private int id;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOff() {
		return off;
	}
	public void setOff(String off) {
		this.off = off;
	}
	public double getOldprice() {
		return oldprice;
	}
	public void setOldprice(double oldprice) {
		this.oldprice = oldprice;
	}
	public double getNewprice() {
		return newprice;
	}
	public void setNewprice(double newprice) {
		this.newprice = newprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Course [img=" + img + ", name=" + name + ", description=" + description + ", off=" + off + ", oldprice="
				+ oldprice + ", newprice=" + newprice + ", id=" + id + "]";
	}
	

}
