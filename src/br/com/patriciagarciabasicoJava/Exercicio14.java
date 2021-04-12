package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		//Variaveis 
		int numero;
		Scanner teclado = new Scanner (System.in);

		//Entrada
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();

		//Processamento
		if (numero %2 == 0) {
			if (numero >0) {
				//Saída
				System.out.printf(" O número %d é positivo e par. \n", numero);
			} else {
				//Saída
				System.out.printf(" O número %d é par e negativo.\n", numero);
			}

		}else {
			if (numero > 0) {
				//Saída
				System.out.printf(" O número %d é positivo e ímpar. \n", numero);
			} else {
				//Saída
				System.out.printf(" O número %d é impar e negativo.\n", numero);
			}
			teclado.close();
		}
	}

}	










