package br.com.silvestredev.pokeapibff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokeapiBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeapiBffApplication.class, args);
	}

}
