package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio7 {
	/*
	 * Faça um Programa que leia três números e mostre o maior e o menor deles.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.println("Entre com o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("Entre com o segundo numero: ");
		num2 = scan.nextInt();
		System.out.println("Entre com o terceiro numero: ");
		num3 = scan.nextInt();

		/* verificando o numero maior */

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 é maior: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 é maior: " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("num3 é maior: " + num3);
		} else {
			System.out.println("Os três números são iguais.");
		}

		/* verificando o numero menor */

		if (num1 < num2 && num1 < num3) {
			System.out.println("num1 é menor: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("num2 é menor: " + num2);
		} else if (num3 < num1 && num3 < num2) {
			System.out.println("num3 é menor: " + num3);
		} else {
			System.out.println("Os três números são iguais.");
		}

	}

}
