package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		//Variaveis
		int c;
		float n, e=0, salario, valor_hora= (float) 10.00;
		Scanner teclado = new Scanner (System.in);

		//Entrada
		System.out.println("Informe o código do funcionário: ");
		c = teclado.nextInt();

		System.out.println(" Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();

		//processamento 
		if (n>50 ) {
			e = (float) (n -50) * (float) 20.00;
			salario = (50 *valor_hora) + e;
			//saida
			System.out.printf(" Salário total do funcionário R$ %.2f\n", salario);
			System.out.printf(" Salário excedente R$ %.2f\n", e);
			//processamento 
		} else {
			salario = n * valor_hora;
			//saida
			System.out.printf(" Salário total R$ %.2f\n", salario);
			System.out.printf(" Salário excedente R$ %.2f\n", e);
		}
		teclado.close();

	}

}
