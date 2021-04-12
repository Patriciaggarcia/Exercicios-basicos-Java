package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Variáveis 
		int num1, num2, soma, multiplicacao;

		Scanner teclado = new Scanner (System.in);

		//Entradas
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = teclado.nextInt();

		//Processamento 
		soma = num1 + num2;
		multiplicacao = soma * num1;

		//Saída 
		System.out.println (" O Resultado da multiplicação é " + multiplicacao);

		teclado.close();
	}

}
