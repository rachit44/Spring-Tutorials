package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.Engine.Engine;

@Component
public class Vehicle {
	public String color;
	public String name;
	
	@Autowired(required = false)
	public Engine engine;
	@Autowired(required = false)
	public Engine elecengine;
	@Autowired(required = false)
	public Engine elecengine2;

	public Vehicle(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	
	public Engine getElecengine() {
		return elecengine;
	}

	public void setElecengine(Engine elecengine) {
		this.elecengine = elecengine;
	}


	public Engine getElecengine2() {
		return elecengine2;
	}

	public void setElecengine2(Engine elecengine2) {
		this.elecengine2 = elecengine2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
