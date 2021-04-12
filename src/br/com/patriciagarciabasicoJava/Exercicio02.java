package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		//Variáveis 
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner (System.in);

		//Entradas
		System.out.println ("Informe a quantidade mínima: ");
		quantidade_minima= teclado.nextInt();

		System.out.println("Informe a quantidade máxima: ");
		quantidade_maxima= teclado.nextInt();

		//Processamento 
		estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

		//Saída 

		System.out.println(" O estoque médio é " + estoque_medio);

		teclado.close ();		
	}

}
