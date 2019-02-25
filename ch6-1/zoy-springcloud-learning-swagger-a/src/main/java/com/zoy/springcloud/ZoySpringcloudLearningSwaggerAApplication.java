package com.zoy.springcloud;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // ·注册为服务
@EnableSwagger2Doc // ·生成Swagger
public class ZoySpringcloudLearningSwaggerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoySpringcloudLearningSwaggerAApplication.class, args);
	}

}
