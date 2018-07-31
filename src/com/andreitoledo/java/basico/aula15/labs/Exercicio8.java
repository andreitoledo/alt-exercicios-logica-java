package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio8 {
	/*
	 * Faça um programa que pergunte o preço de três produtos e informe qual
	 * produto você deve comprar, sabendo que a decisão é sempre pelo mais
	 * barato.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double preco1;
		double preco2;
		double preco3;

		System.out.println("Entre com o preço de primeiro produto: ");
		preco1 = scan.nextDouble();
		System.out.println("Entre com o preço de segundo produto: ");
		preco2 = scan.nextDouble();
		System.out.println("Entre com o preço de terceiro produto: ");
		preco3 = scan.nextDouble();

		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("Deve comprar o primeiro produto: " + preco1);
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("Deve comprar o segundo produto: " + preco2);
		} else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println("Deve comprar o terceiro produto: " + preco3);
		} else {
			System.out.println("Os três produtos tem preços iguais.");
		}

	}

}
