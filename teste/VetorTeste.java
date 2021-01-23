package com.anderson.estruturadados.vetor.teste;

import java.util.Arrays;

import com.anderson.estruturadados.vetor.Vetor;

public class VetorTeste {
	public static void main(String[] args) {
		Vetor vetor=new Vetor(3);
		
		vetor.adiciona("b");
		vetor.adiciona("c");
		vetor.adiciona("e");
		vetor.adiciona("f");
		vetor.adiciona("g");
		
	System.out.println(vetor);
	
	vetor.adiciona(0,"a");
	
	System.out.println(vetor);
	
	vetor.adiciona(3,"d");
	
	System.out.println(vetor);
	
	vetor.adiciona(3,"c2");
	
	System.out.println(vetor);
	}


}
