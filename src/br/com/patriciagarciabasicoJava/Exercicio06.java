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
		peso_ideal = (float) (altura * 72.7) -58; //cast (Função usada para receber o calculo no tipo float 

		//Saída 
		System.out.printf(" Seu peso ideal é %.2f", + peso_ideal);

		teclado.close();

	}
}