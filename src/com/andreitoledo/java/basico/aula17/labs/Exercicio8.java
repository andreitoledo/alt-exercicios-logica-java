package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio8 {
	/*
	 * Faça um programa que leia 5 números e informe a soma e a média dos
	 * números.
	 */

	public static void main(String[] args) {

		int num;
		double media;
		int soma = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com um número: ");
			num = scan.nextInt();

			soma += num;

		}

		media = soma / 5;

		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);

	}

}
