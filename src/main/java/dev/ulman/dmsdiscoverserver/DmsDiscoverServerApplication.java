package dev.ulman.dmsdiscoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DmsDiscoverServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmsDiscoverServerApplication.class, args);
	}

}
