package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio11 {
	
	/* Altere o programa anterior para mostrar no final a soma dos números. */

	public static void main(String[] args) {

		int num1;
		int num2;
		int soma = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número: ");
		num1 = scan.nextInt();

		System.out.println("Entre com o segundo número: ");
		num2 = scan.nextInt();

		for (int i = num1; i <= num2; i++) {
			soma += i;

		}
		
		System.out.println("Soma: " + soma);

	}

}
