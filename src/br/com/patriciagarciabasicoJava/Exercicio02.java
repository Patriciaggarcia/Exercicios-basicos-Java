package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		//Vari�veis 
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner (System.in);

		//Entradas
		System.out.println ("Informe a quantidade m�nima: ");
		quantidade_minima= teclado.nextInt();

		System.out.println("Informe a quantidade m�xima: ");
		quantidade_maxima= teclado.nextInt();

		//Processamento 
		estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

		//Sa�da 

		System.out.println(" O estoque m�dio � " + estoque_medio);

		teclado.close ();		
	}

}
