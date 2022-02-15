package com.valeria.cursojava.aula75_84;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {


		String java = "Java";
		
		for(int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
		
		// o código acima seria o mesmo que
		for(int i=0, j=0; i<3; i++, j++) {
			jav[j] = java.charAt(i);
		}
		System.out.println(jav);
		//
		
		byte[] javByte = new byte[3];
		java.getBytes(0, 3, javByte, 0);
		System.out.println(javByte);
		System.out.println(Arrays.toString(javByte));
		
		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
	}

}
