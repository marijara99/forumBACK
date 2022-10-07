package com.solera.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


//tried to give it some security (com.solera.forum.security) but it didn't workk
@SpringBootApplication ( exclude = {SecurityAutoConfiguration.class} )
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
