package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio1 {
	/* Faça um Programa que peça dois números e imprima o maior deles. */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Entre com o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("Entre com o segundo numero: ");
		num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println("O número maior é: " + num1);
		} else {
			System.out.println("O número maior é: " + num2);
		}

	}

}
