package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Variáveis
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);

		//Entradas 
		System.out.println("Informe o valor em metros: ");
		metros = teclado.nextInt();

		//Processamento 
		centimetros = (metros*100);

		//Saída
		System.out.println(metros + " Metros em centímetros é: " + centimetros);

		teclado.close();


	}

}
