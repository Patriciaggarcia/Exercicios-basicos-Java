package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		//Variaveis 
		int n , maior = 0;
		Scanner teclado = new Scanner (System.in);

		//entrada
		System.out.println(" Informe um n�mero ");
		n = teclado.nextInt();

		//processamento 
		while (n != 0) {

			if (n > maior) {
				maior = n; 
				//Sa�da
			} System.out.println(" Informe um n�mero ");
			n= teclado.nextInt();
		}
		System.out.printf(" O maior n�mero � %d", maior);
		teclado.close();

	}

}


