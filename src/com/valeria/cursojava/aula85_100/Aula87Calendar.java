package com.valeria.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); //padrão de projeto singleton
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minuto = hoje.get(Calendar.MINUTE);
		int segundo = hoje.get(Calendar.SECOND);
		
		System.out.println(hoje);
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println(minuto);
		System.out.println(segundo);
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, minuto, segundo);
		
		hoje.add(Calendar.DAY_OF_MONTH, 2); // adicionado 2 dias na data de hoje
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

	}

}
