package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		//Variaveis 
		float indice;
		Scanner teclado = new Scanner (System.in);

		//entrada
		System.out.println(" Informe o índice de poluição: ");
		indice=teclado.nextFloat();

		//processamento
		if (indice >=0.3 && indice <0.4) {
			//Saida
			System.out.println("Atenção: Industria do grupo 1 devem suspender suas atividades.");

		} else if (indice >=0.4 && indice <0.5) {
			System.out.println("Atenção: Industria do grupo 1 e grupo 2 devem suspender suas atividades.");

		} else if (indice >= 0.5) {
			System.out.println("Atenção: Todos os grupos devem suspender suas atividades.");
		}

		teclado.close();


	}

}
