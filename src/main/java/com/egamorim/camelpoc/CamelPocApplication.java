package com.egamorim.camelpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.egamorim.camelpoc.integration")
public class CamelPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelPocApplication.class, args);
	}
}
