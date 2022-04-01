package com.example.jasyptdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class JasyptPasswordEncryptionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasyptPasswordEncryptionDemoApplication.class, args);
	}

}
