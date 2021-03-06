package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.project.Vehicle;
import com.project.Engine.Engine;

@Configuration
@ComponentScan("com.project.Engine")
public class BeanConfig {
	
	@Bean
	public Vehicle getVehicle() {
		Vehicle veh1 = new Vehicle("white", "Activa");
		return veh1;
	}
	
	/*
	 * @Bean public Vehicle getVehicle2() { Vehicle veh2 = new Vehicle("Pulsar",
	 * "Blue"); return veh2; }
	 */
	@Bean(name = "engine")
	public Engine getEngine() {
		Engine eng = new Engine();
		eng.setCapacity("200CC");
		return eng;
	}
	
	@Bean(name = "elecengine")
	public Engine getElecengine2() {
		Engine eng = new Engine();
		eng.setCapacity("300CC");
		return eng;
	}
	
	@Bean(name = "elecengine2")
	public Engine getElecengine() {
		Engine eng = new Engine();
		eng.setCapacity("250CC");
		return eng;
	}
	
}
