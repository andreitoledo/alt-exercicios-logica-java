package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio2 {
	/*
	 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo
	 * ou negativo.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int valor;
		int resultado;

		System.out.println("Entre com um valor: ");
		valor = scan.nextInt();

		if (valor % 2 == 0) {
			System.out.println("Valor positivo");
		} else {
			System.out.println("Valor negativo");
		}

	}

}
