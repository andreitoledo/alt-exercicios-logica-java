package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
	 * número inteiro entre 1 a 10. O usuário deve informar de qual numero ele
	 * deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
	 */

	public static void main(String[] args) {

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número para gerar a tabuada:");
		num = scan.nextInt();

		System.out.println("Tabuada de " + num + ":");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));

		}

	}

}
