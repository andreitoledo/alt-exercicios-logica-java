package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio6 {
	/*
	 * Faça um programa que peça o raio de um círculo, calcule e mostre sua
	 * área.
	 */

	public static void main(String[] args) {

		double raio;
		double area;

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o raio: ");
		raio = scan.nextDouble();

		/* area = pi x raio^2 */

		area = Math.PI * Math.pow(raio, 2);

		System.out.println("Um círculo cujo o raio " + raio + " sua área é de " + area);

	}

}
