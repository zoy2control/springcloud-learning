package com.zoy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // ·启动 分布式配置中心
@EnableDiscoveryClient
public class ZoySpringcloudLearningConfigGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoySpringcloudLearningConfigGitApplication.class, args);
	}

}
