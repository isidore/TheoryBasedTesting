package org.llewellynlearninghour.theorybasedtesting;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class StrongAES {
	public static byte[] encrypt(String text) {
		try {
			Cipher cipher = getCipher(Cipher.ENCRYPT_MODE);
			byte[] encrypted = cipher.doFinal(text.getBytes());
			return encrypted;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String decrypt(byte[] encrypted) {
		try {
			Cipher cipher = getCipher(Cipher.DECRYPT_MODE);
			String decrypted = new String(cipher.doFinal(encrypted));
			return decrypted;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static Cipher getCipher(int mode)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		String key = "8653821A53BD4"; // 128 bit key
		Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");

		cipher.init(mode, aesKey);
		return cipher;
	}
}