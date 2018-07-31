package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {

	/*
	 * Faça um Programa que peça um número inteiro e determine se ele é par ou
	 * impar. Dica: utilize o operador módulo (resto da divisão).
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.println("Entre com um número inteiro: ");
		numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println("número par.");

		} else {
			System.out.println("número ímpar.");
		}

	}

}
