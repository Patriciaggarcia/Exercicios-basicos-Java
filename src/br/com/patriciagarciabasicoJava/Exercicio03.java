package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		//Vari�veis
		int num1, num2, soma; 
		Scanner teclado =new Scanner(System.in);

		//Entradas 
		System.out.println( " Informe o primeiro n�mero");
		num1 = teclado.nextInt();

		System.out.println( " Informe o segundo n�mero");
		num2 = teclado.nextInt();

		//Processamento 
		soma = num1 + num2;
		
		//Sa�da
		System.out.println(" A soma dos n�meros �: " + soma);

		teclado.close();
	}
}