package com.microservices_with_sb.microservice_with_sb_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceWithSbConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWithSbConfigServerApplication.class, args);
	}

}
