package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		//Variaveis
		int numero, i=0, p=0;
		Scanner teclado = new Scanner (System.in);

		//Entrada 
		System.out.println(" Informe um n�mero: ");
		numero = teclado.nextInt();

		//Processamento 
		if (numero %2 == 0) {
			p = numero;

		} else {
			i= numero;
		}
		//Sa�da
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}

}


