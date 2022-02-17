package com.valeria.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

	public static void main(String[] args) {

		System.out.println("Locale atual: " + Locale.getDefault());
		
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto"); // o arquivo meu-texo.properties foi criado anteriormente 

		System.out.println("Hello EN: " + rb.getString("hello"));
		System.out.println("World EN: " + rb.getString("world"));

		rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR"));

		System.out.println("Olá pt_BR: " + rb.getString("hello"));
		System.out.println("Mundo pt_BR: " + rb.getString("world"));

	}

}
