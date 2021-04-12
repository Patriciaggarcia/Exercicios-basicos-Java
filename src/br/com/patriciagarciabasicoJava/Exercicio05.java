package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		//Variáveis 
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner (System.in);

		//Entradas 
		System.out.println(" Qual o valor que você ganha por hora? ");
		valor_por_hora =teclado.nextFloat();

		System.out.println("Quantas horas você trabalhou esse mês? ");
		horas_trabalhadas = teclado.nextInt();

		//Processamento 
		salario = (horas_trabalhadas * valor_por_hora);

		//Saída 
		System.out.println(" O seu salário esse mês é de R$" + salario);

		teclado.close();

	}

}
