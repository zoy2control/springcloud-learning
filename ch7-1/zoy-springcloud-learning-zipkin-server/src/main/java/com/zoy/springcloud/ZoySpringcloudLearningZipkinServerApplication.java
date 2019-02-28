package com.zoy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer // ·启动zipkin
@EnableEurekaClient
public class ZoySpringcloudLearningZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoySpringcloudLearningZipkinServerApplication.class, args);
	}

}
