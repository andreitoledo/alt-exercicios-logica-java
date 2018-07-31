package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio15 {

	/*
	 * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
	 * Faça um programa capaz de gerar a série até o n−ésimo termo.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
		int n = scan.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo = 1;

		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i <= n; i++) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);

		}



	}

}
