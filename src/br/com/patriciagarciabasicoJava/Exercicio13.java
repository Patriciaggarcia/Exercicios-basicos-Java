package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		//Variaveis 
		int num1, num2, num3, num4, q1, q2, q3, q4;
		Scanner teclado = new Scanner (System.in);

		//Entradas 
		System.out.println(" Informe o primeiro número: ");
		num1 = teclado.nextInt();

		System.out.println(" Informe o segundo número: ");
		num2 = teclado.nextInt();

		System.out.println(" Informe o terceiro número: ");
		num3 = teclado.nextInt();

		System.out.println(" Informe o quarto número: ");
		num4 = teclado.nextInt();

		//Processamento

		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4 * num4;

		if (q3 >= 1000) {
			//Saída
			System.out.println(q3);
		} else {
			//Saída
			System.out.printf ("Num1: %d quadrado %d\n", num1, q1);
			System.out.printf ("Num2: %d quadrado %d\n", num2, q2);
			System.out.printf ("Num3: %d quadrado %d\n", num3, q3);
			System.out.printf ("Num4: %d quadrado %d\n", num4, q4);
		}
		teclado.close();
	}

}
