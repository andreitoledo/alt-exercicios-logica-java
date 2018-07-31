package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {
	/*
	 * faça um programa que peça 2 números inteiros e um número real. 
	 * Calcule e mostre: 
	 * a. o produto do dobro do primeiro com a metade do segundo. 
	 * b. a soma do triplo do primeiro com o terceiro. 
	 * c. o terceiro elevado ao cubo.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numInteiroUm;
		int numInteiroDois;
		double numReal;
		int resultadoA;
		double resultadoB;
		double resultadoC;

		System.out.println("Entre com o primeiro número inteiro: ");
		numInteiroUm = scan.nextInt();
		System.out.println("Entre com o segundo número inteiro: ");
		numInteiroDois = scan.nextInt();
		System.out.println("Entre com um número real: ");
		numReal = scan.nextDouble();

		resultadoA = (numInteiroUm * 2) * (numInteiroDois / 2);
		System.out.println("Resultado A: " + resultadoA);
		
		resultadoB = (numInteiroUm * 3) + numReal;
		System.out.println("Resultado B: " + resultadoB);
		
		resultadoC = Math.pow(numReal, 3);
		System.out.println("Resultado C: " + resultadoC);
		
		

	}

}
