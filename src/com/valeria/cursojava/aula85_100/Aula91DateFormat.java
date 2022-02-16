package com.valeria.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {

		Date hoje = new Date();
		System.out.println(Locale.getDefault());

		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);

		//Locale.setDefault(new Locale("en", "US")); // para modificar o locale do PC
		Locale.setDefault(new Locale("pt", "BR"));

		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado); // dd/MMM/yyyy

		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);

		String data = "16/02/2022 14:25";

		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);

			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);

			System.out.println(calendario);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
