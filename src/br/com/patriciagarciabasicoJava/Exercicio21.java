package br.com.patriciagarciabasicoJava;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		//variaveis 
		String nome, senha;
		Scanner teclado = new Scanner (System.in);

		//Entrada 
		System.out.println(" Informe o nome: ");
		nome = teclado.next ();

		System.out.println(" Informe a senha: ");
		senha = teclado.next ();

		//Processamento 
		while (nome.equals(senha)) {
			System.out.println(" O nome de usário e senha devem ser diferente");
			//entrada 
			System.out.println(" Informe o nome: ");
			nome = teclado.next ();

			System.out.println(" Informe a senha: ");
			senha = teclado.next ();

		}
		teclado.close();
	}
}
