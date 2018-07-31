package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {
	/*
	 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
	 * informar se os valores podem ser um triângulo. Indique, caso os lados
	 * formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
	 * 
	 * o Dicas:
	 * 
	 * Três lados formam um triângulo quando a soma de quaisquer dois lados for
	 * maior que o terceiro; Triângulo Equilátero: três lados iguais; Triângulo
	 * Isósceles: quaisquer dois lados iguais; Triângulo Escaleno: três lados
	 * diferentes;
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double lado1;
		double lado2;
		double lado3;

		System.out.println("Entre com o lado 1: ");
		lado1 = scan.nextDouble();
		System.out.println("Entre com o lado 2: ");
		lado2 = scan.nextDouble();
		System.out.println("Entre com o lado 3: ");
		lado3 = scan.nextDouble();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
				
			} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
				System.out.println("Triângulo Escaleno");
				
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isóceles");
			}

		} else {
			System.out.println("não forma um triângulo");
		}

	}

}
