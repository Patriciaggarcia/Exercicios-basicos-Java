package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		//Vari�veis 
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner (System.in);

		//Entradas 
		System.out.println(" Qual o valor que voc� ganha por hora? ");
		valor_por_hora =teclado.nextFloat();

		System.out.println("Quantas horas voc� trabalhou esse m�s? ");
		horas_trabalhadas = teclado.nextInt();

		//Processamento 
		salario = (horas_trabalhadas * valor_por_hora);

		//Sa�da 
		System.out.println(" O seu sal�rio esse m�s � de R$" + salario);

		teclado.close();

	}

}
