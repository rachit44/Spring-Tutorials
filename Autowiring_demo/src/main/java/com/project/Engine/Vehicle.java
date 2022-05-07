package com.project.Engine;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	List<String> colors = new ArrayList<String>();
	public String name;

	@Autowired
	public Engine engine;
	@Autowired
	public Engine elecengine;
	@Autowired
	public Engine elecengine2;

	/*
	 * public Vehicle(List<String> colors, String name) { this.colors = colors;
	 * this.name = name; }
	 */

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

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
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
