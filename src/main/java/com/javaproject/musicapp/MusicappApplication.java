package com.javaproject.musicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
////@Configuration
////@EnableAutoConfiguration
////@ComponentScan
//public class MusicappApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MusicappApplication.class, args);
//	}
//
//}

@SpringBootApplication
public class  MusicappApplication{ 

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MusicappApplication.class, args);
	}

}