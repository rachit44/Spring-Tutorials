package com.project;

import java.lang.System;

import javax.naming.Context;
import com.project.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("BeanConfig.xml");

		Vehicle veh1 = (Vehicle) app.getBean("v1");
		Vehicle veh2 = app.getBean( Vehicle.class);
		System.out.println(veh1.name + " " + veh1.color);
		System.out.println(veh2.name);
	}

}
