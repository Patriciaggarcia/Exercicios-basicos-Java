package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		//Variaveis 

		float peso_ideal, altura;
		char sexo;

		Scanner teclado = new Scanner (System.in);

		//Entradas 
		System.out.println("Informe o seu sexo (M ou F): ");
		sexo = teclado.next().charAt(0);

		System.out.println("Informe a sua altura: ");
		altura = teclado.nextFloat();

		//Processamento
		if (sexo =='m') {
			peso_ideal= (float) (altura * 72.7) -58; //cast

			//Saída 
			System.out.printf ("Seu peso idela é %.2f", peso_ideal);
		}
		if  (sexo =='f') {

			peso_ideal= (float) (altura * 62.1) - (float) 44.7; //cast
			//Saída 
			System.out.printf("Seu peso idela é %.2f", peso_ideal);
		}
		if (sexo != 'm' && sexo != 'f') {
			//Saída 
			System.out.println(" Sexo não reconhecido");
			peso_ideal= 0;			
		}
		
		teclado.close();
	}
}
