package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio13 {

	/*
	 * Faça um Programa que leia um número e exiba o dia correspondente da
	 * semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
	 * aparecer valor inválido.
	 * se o usuário entrar com letras, lançe uma mensagem que só é permitido numeros.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int diaSemana;
		
		try {

		System.out.println("Entre com um dia da semana (1-7): ");
		diaSemana = scan.nextInt();

			switch (diaSemana) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Valor inválido");
				break;
			}

		} catch (Exception e) {
			System.out.println("Só é permitivo números.");

		}

	}

}
