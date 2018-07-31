package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio3 {

	/*
	 * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
	 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String letra;

		System.out.println("Entre com uma letra (F ou M)");
		letra = scan.next();

		if (letra.equalsIgnoreCase("m")) {
			System.out.println("Masculino");

		} else if (letra.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Sexo inválido.");
		}
	}

}
