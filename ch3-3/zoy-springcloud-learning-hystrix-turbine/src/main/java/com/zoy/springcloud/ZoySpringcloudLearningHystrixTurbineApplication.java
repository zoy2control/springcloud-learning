package com.zoy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class ZoySpringcloudLearningHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoySpringcloudLearningHystrixTurbineApplication.class, args);
	}

}
