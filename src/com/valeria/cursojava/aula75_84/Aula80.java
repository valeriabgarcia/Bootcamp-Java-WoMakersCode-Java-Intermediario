package com.valeria.cursojava.aula75_84;

public class Aula80 {

	public static void main(String[] args) {


		String teste = "Isso � um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10)); //indice de inicio
		System.out.println(teste.substring(10, 15));
		
		String ola = "ol�";
		String mundo = " mundo";
		System.out.println(ola.concat(mundo)); // ola + mundo � mais usual
		
		String espacos = "i s p a � o";
		String semEspaco = espacos.replace('i', 'e');
		System.out.println(semEspaco);
		
		semEspaco = semEspaco.replaceAll(" ", "");
		System.out.println(semEspaco);
		
		String nome = " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim()); //trim remove espa�o no inicio e no fim
		
		

	}

}
