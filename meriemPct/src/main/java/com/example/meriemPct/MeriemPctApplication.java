package com.example.meriemPct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeriemPctApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeriemPctApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.EPARGNE));
			compteRepository.findAll().forEach(compte -> {
				System.out.println(compte);
			});

		};
	}
}
