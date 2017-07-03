package cn.joylau.code;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JoylauMultiGitRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoylauMultiGitRepoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(JoylauMultiGitRepoApplication ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");
		};
	}
}
