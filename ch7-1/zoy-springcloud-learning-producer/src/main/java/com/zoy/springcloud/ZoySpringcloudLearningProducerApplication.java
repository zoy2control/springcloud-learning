package com.zoy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
public class ZoySpringcloudLearningProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoySpringcloudLearningProducerApplication.class, args);
	}

}
