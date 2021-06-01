package com.example.springtraining;

import com.example.springtraining.controllers.*;
import com.example.springtraining.examplebeans.FakeDataSource;
import com.example.springtraining.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class SpringTeoreticalExerciseProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringTeoreticalExerciseProjectApplication.class, args);



		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------------Primary BEAN");
		System.out.println(myController.sayHello());

		System.out.println("------------Property injection");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------Setter injection");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------Construction injection");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
	}

}
