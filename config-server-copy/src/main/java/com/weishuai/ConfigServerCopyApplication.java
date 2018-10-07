package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 将Config Server多实例部署，实现高可用的Config Server
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerCopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerCopyApplication.class, args);
	}
}
