package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {
	/*
	 * faça umprograma que peça a temperatura em graus Celsius, transforme e
	 * mostre em graus Farenheit.
	 */

	public static void main(String[] args) {

		double f;
		double c;

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em graus Celsius: ");
		c = scan.nextDouble();

		/* F=1,8⋅37+32 */

		f = (c * 1.8) + 32;

		System.out.println("A temperatura em Farenheit é: " + f + " F");

	}

}
