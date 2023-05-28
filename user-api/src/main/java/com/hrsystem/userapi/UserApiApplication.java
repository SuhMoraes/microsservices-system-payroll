package com.hrsystem.userapi;

import com.hrsystem.userapi.domain.User;
import com.hrsystem.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApiApplication implements CommandLineRunner {
		@Autowired
		private UserRepository userRepository;

		public static void main(String[] args) {
			SpringApplication.run(UserApiApplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			userRepository.saveAll(List.of(
					new User(null, "Mayara", "may@mail.com","456", 35.5),
					new User(null, "Maria Silva", "maria.silva@example.com", "password123", 32.98),
					new User(null, "João Santos", "joao.santos@example.com", "password456", 42.55),
					new User(null, "Ana Oliveira", "ana.oliveira@example.com", "password789", 29.50),
					new User(null, "Pedro Souza", "pedro.souza@example.com", "passwordabc", 22.98),
					new User(null, "Carla Pereira", "carla.pereira@example.com", "passworddef", 500),
					new User(null, "Miguel Almeida", "miguel.almeida@example.com", "passwordghi", 600),
					new User(null, "Sofia Costa", "sofia.costa@example.com", "passwordjkl", 700),
					new User(null, "Antônio Rodrigues", "antonio.rodrigues@example.com", "passwordmno", 800),
					new User(null, "Beatriz Ferreira", "beatriz.ferreira@example.com", "passwordpqr", 900),
					new User(null, "Rafael Gomes", "rafael.gomes@example.com", "passwordstu", 1000),
					new User(null, "Isabella Barbosa", "isabella.barbosa@example.com", "passwordvwx", 1100)
			));

		}
	}
