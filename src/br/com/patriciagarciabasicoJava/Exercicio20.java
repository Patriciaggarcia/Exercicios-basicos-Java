package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		//variaveis 
		int valor, maior = -999, menor = 999, soma =0;
		float media;
		Scanner teclado = new Scanner (System.in);


		//Processamento 
		for (int i = 0; i <10; i++) {
			System.out.println(" Informe um valor: ");
			valor = teclado.nextInt();

			if (valor >0) {
				if (valor > maior) {
					maior = valor;
				}
				soma = soma + valor;				 
			} else {
				i--;
			}
		}
		media = soma /10;
		//Saida
		System.out.println(" O maior número é " + maior);
		System.out.println(" O menor número é " + menor);
		System.out.println(" A Média é " + media);

		teclado.close();
	}
}
