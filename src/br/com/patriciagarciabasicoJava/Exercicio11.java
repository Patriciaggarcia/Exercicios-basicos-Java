package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		//Variaveis 
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner (System.in);

		//Entradas
		System.out.println(" Por favor informe o pesos dos peixes: ");
		p = teclado.nextFloat();

		//Processamento 
		if  (p > 50){
			m =  (float) (p- 50) * (float) 4.00;
			//Saida
			System.out.printf(" Você deverá pagar R$ %.2f em multas ", m);
			//Processamento 
		} else {
			m = 0;
			e = "0"; 
			//Saida
			System.out.println("Multas: " + m);
			System.out.println("Excesso: " + e);
		}
		teclado.close();
	}

}
