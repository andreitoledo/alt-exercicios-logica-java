package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio7 {

	/**
	 * Faça um programa que leia 5 números e informe o maior número.
	 */

	public static void main(String[] args) {

		int num;
		int maior = Integer.MIN_VALUE;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com o um número:");
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
				System.out.println("O número maior mudou para: " + maior);

			}

		}

		System.out.println("O maior número digitado foi: " + maior);

	}

}
