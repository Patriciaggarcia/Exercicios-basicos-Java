package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Variaveis 		
		int numero, a, b;
		Scanner teclado = new Scanner (System.in);

		//Entradas
		System.out.println(" Por favor informe um número: ");
		numero = teclado.nextInt();

		//processamento
		if ( numero >0) {
			a = numero;
			// Saída 
			System.out.println(a);
		} else {
			b = numero; 
			System.out.println(b);
		}

		teclado.close();
	}

}


