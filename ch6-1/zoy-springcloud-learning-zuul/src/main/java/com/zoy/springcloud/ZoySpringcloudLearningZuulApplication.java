package com.zoy.springcloud;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // ·启动 zuul智能路由代理
@EnableSwagger2Doc // ·启动 swagger2
public class ZoySpringcloudLearningZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoySpringcloudLearningZuulApplication.class, args);
	}

}
