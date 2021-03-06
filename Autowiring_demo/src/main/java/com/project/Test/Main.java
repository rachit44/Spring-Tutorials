package com.project.Test;

import java.lang.System;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.Engine.Vehicle;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app1 = new ClassPathXmlApplicationContext("BeanConfig.xml");

		Vehicle veh1 = (Vehicle) app1.getBean("v1");
		Vehicle veh2 = (Vehicle) app1.getBean("v2");
		System.out.println("Name :" + veh1.getName() + " 		Colors : " + veh1.getColors()); // wiring
		System.out.println("Name :" + veh2.name + "	Colors : "+ veh2.getColors() + "		Engine : " + veh2.elecengine.capacity);
		System.out.println("Name :" + veh2.name + "	Engine : " + veh2.getElecengine2().getCapacity());
	}

}
