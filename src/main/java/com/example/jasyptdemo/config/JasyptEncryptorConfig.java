package com.example.jasyptdemo.config;

//@Configuration
//public class JasyptEncryptorConfig {
//	@Bean(name = "jasyptStringEncryptor")
//	public StringEncryptor getPasswordEncryptor() {
//		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//		config.setPassword("dbydby"); // encryptor's private key
//		config.setAlgorithm("PBEWithMD5AndDES");
//		config.setKeyObtentionIterations("1000");
//		config.setPoolSize("1");
//		config.setProviderName("SunJCE");
//		config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
//		config.setStringOutputType("base64");
//		encryptor.setConfig(config);
//		return encryptor;
//	}
//}
