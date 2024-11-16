package com.example.demo.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ItemsClick")
public class ItemsClick {
	@Id
	int id;
	String img;
	String name;
	String old_price;
	String new_price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getOld_price() {
		return old_price;
	}
	public void setOld_price(String old_price) {
		this.old_price = old_price;
	}
	public String getNew_price() {
		return new_price;
	}
	public void setNew_price(String new_price) {
		this.new_price = new_price;
	}
	public ItemsClick(int id, String img, String name, String old_price, String new_price) {
		super();
		this.id = id;
		this.img = img;
		this.name = name;
		this.old_price = old_price;
		this.new_price = new_price;
	}
	
	@Override
	public String toString() {
		return "ItemsClick [id=" + id + ", img=" + img + ", name=" + name + ", old_price=" + old_price + ", new_price="
				+ new_price + "]";
	}
	public ItemsClick() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
