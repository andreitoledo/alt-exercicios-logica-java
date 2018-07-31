package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio5 {
	/* Faça um programa que converta metrs para centímetros. */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double metros;
		double cm;

		System.out.println("Entre com a quantidade de metros:");
		metros = scan.nextDouble();

		// 1m = 100 cm
		cm = metros * 100;

		System.out.println(metros + " m é igual a " + cm + "cm");

	}

}
