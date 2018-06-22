package com.izziloop.thereadingtroll.thereadingtroll;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class ApplicationStarter {

	public static void main(String[] args) {
		log.info("Start The Reading Troll");
		SpringApplication.run(ApplicationStarter.class, args);
		log.info("Exit The Reading Troll");
	}
}
