package com.example.sfgdi;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.controllers.I18nController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjectedController;
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

		System.out.println("--------- Primary");

//		setting a primary bean allows to use a base bean when we do not specify which one we what to use with qualifier
		System.out.println(myController.sayHello());

		System.out.println("----------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("==================== Profiles =====================");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());
	}

}
