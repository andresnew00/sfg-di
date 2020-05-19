package com.example.sfgdi;

import com.example.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
//		run returns back an application context that is why we assign it to the ApplicationContext Object
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//		the name of the bean is the name of the class starting with a lower case by default
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
