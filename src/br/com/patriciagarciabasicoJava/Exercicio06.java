package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main (String [] args) {

		//Variaveis 
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);

		//Entradas 
		System.out.println(" Informe a sua Altura: ");
		altura = teclado.nextFloat();

		//Processamento 
		peso_ideal = (float) (altura * 72.7) -58; //cast (Fun��o usada para receber o calculo no tipo float 

		//Sa�da 
		System.out.printf(" Seu peso ideal � %.2f", + peso_ideal);

		teclado.close();

	}
}