package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * config server
 * EurekaClient （服务提供者）
 */
@SpringBootApplication
@EnableConfigServer  //开启ConfigServer的功能
@EnableEurekaClient  //开启EurekaClient的功能
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
