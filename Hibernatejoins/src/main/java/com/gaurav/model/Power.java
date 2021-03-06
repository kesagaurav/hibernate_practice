package com.gaurav.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Power {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int power_id;
	@Column(name="powers")
	private String powers;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="villian_fk")
	private Villian villian;
	
	public Power() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Power (String powers,Villian villian) {
		super();
		this.powers = powers;
		this.villian=villian;
	}
	
	
	
	
	
	public Villian getVillian() {
		return villian;
	}
	public void setVillian(Villian villian) {
		this.villian = villian;
	}
	public int getPower_id() {
		return power_id;
	}
	public void setPower_id(int power_id) {
		this.power_id = power_id;
	}
	public String getPowers() {
		return powers;
	}
	public void setPowers(String powers) {
		this.powers = powers;
	}
	@Override
	public String toString() {
		return "Power [power_id=" + power_id + ", powers=" + powers + ", villian=" + villian + "]";
	}
	
	
	
	
	
}
