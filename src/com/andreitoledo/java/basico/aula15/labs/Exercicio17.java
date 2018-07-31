package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {

	/*
	 * Faça um Programa que peça um número correspondente a um determinado ano e
	 * em seguida informe se este ano é ou não bissexto.
	 */

	/*
	 * Inicio Declare ano Inteiro; Declare bissexto Booleano; Leia(ano); Se (
	 * ano módulo 400 é 0 ) então bissexto=Verdade; Senão Se (ano módulo 4 é 0 E
	 * ano módulo 100 é diferente de 0) então bissexto=Verdade; Senão
	 * bissexto=Falso; Fim
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int ano;
		boolean bissexto;

		System.out.println("Entre com o ano: ");
		ano = scan.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("é bissexto.");

		} else {
			System.out.println("não é bissexto.");
		}

	}

}
