package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio2 {
	/*
	 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
	 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando
	 * a pedir as informações.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoInvalida = false;
		String nome;
		String senha;

		do {
			System.out.println("Entre com o nome do usuário: ");
			nome = scan.nextLine();

			System.out.println("Entre com a senha: ");
			senha = scan.nextLine();

			if (!nome.equalsIgnoreCase(senha)) {
				infoInvalida = true;
				System.out.println("Senha e usuário válido.");

			} else if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual a usuário, digite novamente.");
			}

		} while (!infoInvalida);

	}

}
