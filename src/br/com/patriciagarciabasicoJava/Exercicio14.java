package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		//Variaveis 
		int numero;
		Scanner teclado = new Scanner (System.in);

		//Entrada
		System.out.println("Informe um n�mero: ");
		numero = teclado.nextInt();

		//Processamento
		if (numero %2 == 0) {
			if (numero >0) {
				//Sa�da
				System.out.printf(" O n�mero %d � positivo e par. \n", numero);
			} else {
				//Sa�da
				System.out.printf(" O n�mero %d � par e negativo.\n", numero);
			}

		}else {
			if (numero > 0) {
				//Sa�da
				System.out.printf(" O n�mero %d � positivo e �mpar. \n", numero);
			} else {
				//Sa�da
				System.out.printf(" O n�mero %d � impar e negativo.\n", numero);
			}
			teclado.close();
		}
	}

}	










