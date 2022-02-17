package com.valeria.cursojava.aula85_100;

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 100));

		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt());
		
		System.out.println(aleatorio.nextDouble());

		System.out.println(aleatorio.nextInt(100 + 1)); // numeros aleatorios entre 0 e 100 

	}

}
