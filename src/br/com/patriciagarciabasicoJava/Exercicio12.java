package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		//Variaveis
		int c;
		float n, e=0, salario, valor_hora= (float) 10.00;
		Scanner teclado = new Scanner (System.in);

		//Entrada
		System.out.println("Informe o c�digo do funcion�rio: ");
		c = teclado.nextInt();

		System.out.println(" Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();

		//processamento 
		if (n>50 ) {
			e = (float) (n -50) * (float) 20.00;
			salario = (50 *valor_hora) + e;
			//saida
			System.out.printf(" Sal�rio total do funcion�rio R$ %.2f\n", salario);
			System.out.printf(" Sal�rio excedente R$ %.2f\n", e);
			//processamento 
		} else {
			salario = n * valor_hora;
			//saida
			System.out.printf(" Sal�rio total R$ %.2f\n", salario);
			System.out.printf(" Sal�rio excedente R$ %.2f\n", e);
		}
		teclado.close();

	}

}
