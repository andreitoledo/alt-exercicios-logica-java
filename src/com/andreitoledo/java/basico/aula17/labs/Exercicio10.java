package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {

	/*
	 * Faça um programa que receba dois números inteiros e gere os números
	 * inteiros que estão no intervalo compreendido por eles.
	 */

	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número: ");
		num1 = scan.nextInt();

		System.out.println("Entre com o segundo número: ");
		num2 = scan.nextInt();

		for (int i = num1; i <=num2; i++) {
			System.out.println(i);

		}

	}

}
