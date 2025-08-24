package com.telusko.app;

import com.telusko.app.model.Alien;
import com.telusko.app.model.Laptop;
import com.telusko.app.model.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBootDemoApplication.class, args);


		LaptopService Service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		Service.addLaptop(lap);














//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();


//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();

//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();

//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();

	}

}
