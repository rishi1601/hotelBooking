package com.hotelbooking.security;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoder {

	
	public static String encrypt(String password) {
		String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));
		return generatedSecuredPasswordHash;
	}

	public static boolean decrypt(String userInput, String password) {
		boolean checkPassword = BCrypt.checkpw(userInput, password);
		return checkPassword;

	}

}
