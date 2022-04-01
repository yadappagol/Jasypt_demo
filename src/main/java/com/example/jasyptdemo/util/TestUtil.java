package com.example.jasyptdemo.util;

import org.jasypt.encryption.StringEncryptor;

public class TestUtil {
	public static void main(String[] args) {

		CustomJasyptEncryption obj = new CustomJasyptEncryption();
		StringEncryptor stringEncryptor = obj.getPasswordEncryptor();
		String userName = "root";
		String password = "root";
		String encryptedUsername = stringEncryptor.encrypt(userName);
		String encryptedPassword = stringEncryptor.encrypt(password);

		System.out.println("Encrypted username : " + encryptedUsername);
		System.out.println("Encrypted Password : " + encryptedPassword);

	}
}
