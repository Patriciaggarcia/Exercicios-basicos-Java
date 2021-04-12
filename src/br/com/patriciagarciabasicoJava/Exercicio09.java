package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		//Variaveis
		int numero, i=0, p=0;
		Scanner teclado = new Scanner (System.in);

		//Entrada 
		System.out.println(" Informe um número: ");
		numero = teclado.nextInt();

		//Processamento 
		if (numero %2 == 0) {
			p = numero;

		} else {
			i= numero;
		}
		//Saída
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}

}


