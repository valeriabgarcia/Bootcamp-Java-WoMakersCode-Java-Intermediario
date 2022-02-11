package com.valeria.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(2, 5));
		System.out.println(soma(2, 5, 1));

		// usando parametro do tipo array
		int[] vetor = { 1, 2, 3, 4, 5 };
		System.out.println(soma(vetor));
		
		// usando Varargs
		System.out.println(soma(1, 2, 3, 4, 5));

	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	// usando parametro do tipo array
	static int soma(int[] vetor) {
		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}

	// usando Varargs
	static int soma(Integer... vetor) { //static int soma(int a, int b, Integer... vetor)
		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}

}
