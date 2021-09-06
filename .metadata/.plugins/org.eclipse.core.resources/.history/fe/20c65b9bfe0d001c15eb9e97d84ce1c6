package com.gaurav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Marvel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto generate
	public int id;
	@Column(name="name")
	public String name;
	@Column(name="color")
	public String color;
	@Column(name="weapons")
	public String weapons;
	public Marvel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marvel(String name, String color, String weapons) {
		super();
		this.name = name;
		this.color = color;
		this.weapons = weapons;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeapons() {
		return weapons;
	}
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	@Override
	public String toString() {
		return "Marvel [id=" + id + ", name=" + name + ", color=" + color + ", weapons=" + weapons + "]";
	}


	
	

}
