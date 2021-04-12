package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		//Variaveis
		int n;
		Scanner teclado = new Scanner (System.in);

		//Entradas 
		System.out.println("Informe um valor: ");
		n = teclado.nextInt();		

		//Processamento
		if (n>100) {        	 
			System.out.println(n);
		} else {
			n = 0;

			//Saída
			System.out.println(" O valor é " + n );
		}		

		teclado.close();

	}

}
