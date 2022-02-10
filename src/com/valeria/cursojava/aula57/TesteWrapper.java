package com.valeria.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {

		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 6.55555;
		boolean flag = true;
		char a = 'a';

		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');

		Integer num13 = new Integer("1000");

		Double num14 = new Double("3.5");

		System.out.println(num13.intValue());
		System.out.println(num13.longValue());

		Long num15 = num13.longValue();

		int num16 = Integer.parseInt("100000");
		System.out.println(num16);

		double num17 = Double.parseDouble("3.555");
		System.out.println(num17);

		Integer num18 = Integer.valueOf(1348);
		System.out.println(num18);

		System.out.println(num9 == num13); // == n�o funciona com wrappers - false

	}

}
