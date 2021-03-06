package com.gaurav.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Villian {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto generate
	public int id;
	@Column(name = "name")
	public String name;
	@Column(name = "color")
	public String color;
	@Column(name = "weapons")
	public String weapons;
	@OneToMany(mappedBy = "villian",cascade = CascadeType.ALL,fetch = FetchType.EAGER)// if we do not keep mappedBy in hibernate then it will show us the three tables created they are Villian,Villain_power,Power
	// so for not creating the 3 tables generally what we do is we will keep MappedBy="villian"
	// so that it will again creating only 2 tables which is Villian and Power and no Villian_Power will not be created because of 
	// MappedBy 
	public List<Power> power;

	public Villian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Villian(String name, String color, String weapons, List<Power> power) {
		super();
		this.name = name;
		this.color = color;
		this.weapons = weapons;
		this.power = power;
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

	public List<Power> getPower() {
		return power;
	}

	public void setPower(List<Power> power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Villian [id=" + id + ", name=" + name + ", color=" + color + ", weapons=" + weapons + ", power=" + power
				+ "]";
	}

}
