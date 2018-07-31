package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio3 {
	/*
	 * Faça um programa que leia e valide as seguintes informações: a.
	 * Nome:maior que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior
	 * que zero; d. Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
	 */

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;

		String nome, sexo, estadoCivil;
		int idade = 0;
		double salario = 0;		

		/* bloco nome */

		do {
			System.out.println("Entre com um nome: ");
			nome = scan.nextLine();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome inválido, digite novamente.");
			}

		} while (!infoValida);

		infoValida = false;

		/* bloco idade */

		try {
			infoValida = false;
			do {
				System.out.println("Entre com a idade: ");
				idade = scan.nextInt();

				if (idade > 0 & idade <= 150) {
					infoValida = true;
				} else {
					System.out.println("Idade inválida, digite novamente.");
				}

			} while (!infoValida);

		} catch (Exception e) {
			System.out.println("Idade tem que ser numérica.");

		}

		/* bloco salario */

		try {
			infoValida = false;
			do {
				System.out.println("Entre com o salário: ");
				salario = scan.nextDouble();

				if (salario > 0) {
					infoValida = true;

				} else {
					System.out.println("Salário inválido.");
				}

			} while (!infoValida);

		} catch (Exception e) {
			System.out.println("Salário tem que ser numérico.");

		}

		/* bloco sexo */

		infoValida = false;
		do {
			System.out.println("Entre com o Sexo: ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo inválido, 'm' ou 'f'.");
			}

		} while (!infoValida);

		/* bloco estado civil */

		infoValida = false;
		do {
			System.out.println("Entre com o estado civil: ");
			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil inválido, 'c', 's', 'd', 'v'.");
			}

		} while (!infoValida);

		System.out.println("Informações coletadas:");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("E. Civil: " + estadoCivil);

	}
}
