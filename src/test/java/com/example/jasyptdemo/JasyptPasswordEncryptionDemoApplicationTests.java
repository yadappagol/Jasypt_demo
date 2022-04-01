package com.example.jasyptdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JasyptPasswordEncryptionDemoApplicationTests {

	
	@Test
	void contextLoads() {
	}
	
	
//	@Test
//	public void testPasswordEncryption() {
//		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//		config.setPassword("javatechie"); // encryptor's private key
//		config.setAlgorithm("PBEWithMD5AndDES");
//		config.setKeyObtentionIterations("1000");
//		config.setPoolSize("1");
//		config.setProviderName("SunJCE");
//		config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
//		config.setStringOutputType("base64");
//		encryptor.setConfig(config);
//		String plainText = "root";
//		String encryptedPassword = encryptor.encrypt(plainText);
//		System.out.println("encryptedPassword : " + encryptedPassword);
//	}

}
