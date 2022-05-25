package com.example.Ejercicio8_BS4_Perfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:miconfiguracion.properties") Por defecto lee el application.properties
public class Ejercicio8Bs4PerfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio8Bs4PerfilesApplication.class, args);
	}

}
