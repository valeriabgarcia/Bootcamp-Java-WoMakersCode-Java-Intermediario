package com.valeria.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {

		Calendar calendario = Calendar.getInstance();
		TimeZone tz = calendario.getTimeZone();
		System.out.println(tz); // fuso hor�rio do pa�s e estado

		/*String[] fusos = TimeZone.getAvailableIDs();
		for (String fuso: fusos) {
			System.out.println(fuso);
		}*/

		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");

		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());

		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));

		Calendar agoraSP = Calendar.getInstance(tzSP);
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));

		agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
		System.out.println(sdf.format(agoraSP.getTime())); //hor�rio de NY

	}

}
