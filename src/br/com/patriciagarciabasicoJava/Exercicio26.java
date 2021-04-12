package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		//Variaveis 
		int [] vetor = new int [10];
		Scanner teclado = new Scanner (System.in);

		//Entradas
		for (int i = 0; i<10; i++) {
			System.out.println("Informe o valor para o vetor: ");
			vetor[i] = teclado.nextInt();			
		}
		//Processamento
		for (int i = (vetor.length - 1) ; i>=0; i--) {
			//saida
			System.out.println(vetor[i]);
		}
		teclado.close();
	}
}
