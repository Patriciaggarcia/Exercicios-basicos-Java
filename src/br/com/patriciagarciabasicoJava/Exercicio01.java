package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Vari�veis 
		int num1, num2, soma, multiplicacao;

		Scanner teclado = new Scanner (System.in);

		//Entradas
		System.out.println("Informe o primeiro n�mero: ");
		num1 = teclado.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		num2 = teclado.nextInt();

		//Processamento 
		soma = num1 + num2;
		multiplicacao = soma * num1;

		//Sa�da 
		System.out.println (" O Resultado da multiplica��o � " + multiplicacao);

		teclado.close();
	}

}
