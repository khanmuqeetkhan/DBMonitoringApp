package se.learn.db.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DbMonitoringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbMonitoringAppApplication.class, args);
	}
}
