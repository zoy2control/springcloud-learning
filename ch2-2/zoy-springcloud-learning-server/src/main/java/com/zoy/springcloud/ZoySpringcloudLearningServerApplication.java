package com.zoy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // ·注册为 服务注册中心
public class ZoySpringcloudLearningServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoySpringcloudLearningServerApplication.class, args);
	}

}
