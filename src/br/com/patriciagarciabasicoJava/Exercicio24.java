package br.com.patriciagarciabasicoJava;

import java.util.ArrayList;

public class Exercicio24 {

	public static void main(String[] args) {

		//Variaveis 

		ArrayList<Integer> vetor= new ArrayList<Integer> ();
		ArrayList<Integer> pares= new ArrayList<Integer> ();


		// Processamento
		for (int i = 0; i <5; i++) {
			vetor.add(i);
			if (i %2 ==0) {
				if (i >0 ) {
					pares.add(i);
				}	
			}
		}

		for (Integer n: pares) {
			//Saída
			System.out.println(n);
		}
	}
}
