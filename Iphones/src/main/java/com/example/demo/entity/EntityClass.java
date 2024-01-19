package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class EntityClass { 	
@jakarta.persistence.Id
	private int Id;
	private String Model;
	private String Color;
	private int Qty;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public EntityClass(int id, String model, String color, int qty) {
		super();
		Id = id;
		Model = model;
		Color = color;
		Qty = qty;
	}
	public EntityClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
