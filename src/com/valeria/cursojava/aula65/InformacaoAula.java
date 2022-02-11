package com.valeria.cursojava.aula65;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "http://google.com";
	
	String site() default "http://loiane.training";;

}
