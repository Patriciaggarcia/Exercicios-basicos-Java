package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		//Variaveis

		int [] vetor = new int [20];
		int soma = 0;
		Scanner teclado = new Scanner (System.in);

		//entrada 
		for (int i = 0; i < 20; i++ ) {
			System.out.println(" Informe o valor para o vetor: ");
			vetor[i] = teclado.nextInt();		
			//processamento
			soma = soma + vetor[i];
		}
		//saida
		System.out.printf(" A soma é %d", soma);
		teclado.close();
	}
}
