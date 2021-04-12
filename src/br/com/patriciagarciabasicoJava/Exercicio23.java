package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		//Variaveis 
		int contador_total = 0, contador_sit_1 = 0,contador_sit_2 = 0,contador_sit_3 = 0,contador_sit_4 = 0,
				identificacao, defeito;

		Scanner teclado = new Scanner (System.in);

		//Entrada 
		System.out.println("Informe a identificação do mouse: ");
		identificacao = teclado.nextInt();

		//processamento 
		while (identificacao !=0) {

			System.out.println("1 - Necessidade da esfera.");
			System.out.println("2 - Necessidade de limpeza.");
			System.out.println("3 - Necessidade de troca do cabo ou conector.");
			System.out.println("4 - Quebrado ou inutilizável.");

			System.out.println("Informe o defeito: ");
			defeito = teclado.nextInt();

			if (defeito ==1) {
				contador_sit_1 = contador_sit_1 +1;
			} if (defeito ==2) {
				contador_sit_2 = contador_sit_2 +1;
			} if (defeito ==3) {
				contador_sit_3 = contador_sit_3 +1;
			} if (defeito ==4) {
				contador_sit_4 = contador_sit_4 +1;
			}
			contador_total = contador_total +1;
			System.out.println(" Informe a identificação: ");
			identificacao = teclado.nextInt();
		}
		float p1, p2, p3, p4;
		p1 = ((float) contador_sit_1 / (float) contador_total) * (float) 100.00;
		p2 = ((float) contador_sit_2 / (float) contador_total) * (float) 100.00;
		p3 = ((float) contador_sit_3 / (float) contador_total) * (float) 100.00;
		p4 = ((float) contador_sit_4 / (float) contador_total) * (float) 100.00;

		System.out.printf("Quantidade de mouse: %d\n", contador_total);
		System.out.println(" Situação \t\t\t\tQuantidade \tPercentual");
		System.out.printf("1 - Necessidade da esfera. \t\t\t%d \t\t%.2f\n", contador_sit_1, p1);
		System.out.printf("2 - Necessidade de limpeza. \t\t\t%d \t\t%.2f\n", contador_sit_2, p2);
		System.out.printf("3 - Necessidade de troca do cabo ou conector. \t%d \t\t%.2f\n", contador_sit_3, p3);
		System.out.printf("4 - Quebrado ou inutilizável. \t\t\t%d \t\t%.2f\n", contador_sit_4, p4);

		teclado.close();
	}
}
