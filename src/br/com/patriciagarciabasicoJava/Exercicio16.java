package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		//Variavel 
		int idade;
		Scanner teclado = new Scanner (System.in);

		//Entradas
		System.out.println(" Informe a sua idade: ");
		idade = teclado.nextInt();

		//Processamento 

		if (idade >=5 && idade <=7) {
			//Saida
			System.out.println(" Você é da categoria infantil A");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println(" Você é da categoria infantil B");
		}else if (idade >= 12 && idade <=13) {
			System.out.println(" Você é da categoria Junevil A");
		}else if (idade >= 14 && idade <=17) {
			System.out.println(" Você é da categoria Junevil B");
		}else if (idade >18) {
			System.out.println(" Você é da categoria Adulto (Maior de 18 anos)");
		} else 
			System.out.println(" Não reconhecemos a sua idade");

		teclado.close();
	}
}
