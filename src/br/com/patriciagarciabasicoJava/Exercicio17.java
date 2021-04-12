package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		//Variaveis 
		int n , maior = 0;
		Scanner teclado = new Scanner (System.in);

		//entrada
		System.out.println(" Informe um número ");
		n = teclado.nextInt();

		//processamento 
		while (n != 0) {

			if (n > maior) {
				maior = n; 
				//Saída
			} System.out.println(" Informe um número ");
			n= teclado.nextInt();
		}
		System.out.printf(" O maior número é %d", maior);
		teclado.close();

	}

}


