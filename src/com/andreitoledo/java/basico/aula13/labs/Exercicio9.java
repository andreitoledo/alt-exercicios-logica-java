package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio9 {
	/*
	 * faça um programa que peça a temperatura em graus Farenheit, transforme e
	 * mostre a temperatura em graus Celsius.
	 */

	public static void main(String[] args) {

		double f;
		double c;
		double c2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em graus Farenheit: ");
		f = scan.nextDouble();

		c = (f - 32) / 1.8;

		c2 = (5 * (f - 32) / 9);

		System.out.println("Em Celsius: " + c + " C");
		System.out.println("Em Celsius com a formila passada: " + c2 + " C");

	}

}
