package com.app.pojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoExamplesApplication.class, args);
		System.out.println("hiii");
                int i=1000;
                int y=2000;
                int z=x+y;
               System.out.println(z);
	}

}
