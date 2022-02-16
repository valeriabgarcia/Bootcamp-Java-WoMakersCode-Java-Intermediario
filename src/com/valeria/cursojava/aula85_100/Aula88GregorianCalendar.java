package com.valeria.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {

		Calendar hoje1 = Calendar.getInstance();

		GregorianCalendar hoje = new GregorianCalendar();
		
		//System.out.println(hoje);

		imprimirData(hoje);
		
		System.out.println(hoje.isLeapYear(2022));
		
		GregorianCalendar hoje2 = new GregorianCalendar(2022, 0, 1);
		imprimirData(hoje2);
		
		GregorianCalendar hoje3 = new GregorianCalendar(2022, 0, 1, 14, 30, 15);
		imprimirData(hoje3);
	}

	public static void imprimirData(Calendar hoje) {
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minuto = hoje.get(Calendar.MINUTE);
		int segundo = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje � : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, minuto, segundo);
		
		System.out.println();
	}

}
