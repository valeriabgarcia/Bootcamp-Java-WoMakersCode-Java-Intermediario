package com.valeria.cursojava.aula85_100;

import java.util.Date;

import com.valeria.cursojava.aula54.Data;

public class Aula86Date {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milissegundos desde 1 jan de 1970: " + hoje.getTime());
		
		System.out.println(hoje.getDate());

	}

}
