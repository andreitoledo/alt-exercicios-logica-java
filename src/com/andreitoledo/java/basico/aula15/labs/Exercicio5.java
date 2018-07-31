package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio5 {

	/*
	 * Faça um programa para a leitura de duas notas parciais de um aluno. O
	 * programa deve calcular a média alcançada por aluno e apresentar: a. A
	 * mensagem "Aprovado", se a média alcançada for maior ou igual a sete; b. A
	 * mensagem "Reprovado", se a média for menor do que sete; c. A mensagem
	 * "Aprovado com Distinção", se a média for igual a dez.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double nota1;
		double nota2;
		double media;

		System.out.println("Entre com a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota2 = scan.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media < 7) {
			System.out.println("Reprovado. Média: " + media);
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado. Média: " + media);
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção. Média: " + media);
		}

	}

}
