package com.project.Test;

import java.lang.System;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.Vehicle;
import com.project.config.BeanConfig;


public class Main {
	public static void main(String[] args) {
//		ApplicationContext app1 = new ClassPathXmlApplicationContext("BeanConfig.xml");
		
		ApplicationContext app1 = new AnnotationConfigApplicationContext(BeanConfig.class);
		Vehicle veh1 = app1.getBean(Vehicle.class);
		Vehicle veh2 = app1.getBean(Vehicle.class);
		System.out.println("Name :" + veh1.getName() + " 	Color : " + veh1.getColor() + "	 Engine : " + veh1.getEngine().getCapacity() ); // wiring
		System.out.println(veh2.name + "	" + veh2.getElecengine().getCapacity());
		System.out.println(veh2.name + "	" + veh2.getElecengine2().getCapacity());
	}

}
