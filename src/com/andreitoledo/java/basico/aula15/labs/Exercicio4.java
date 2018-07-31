package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio4 {
	/*
	 * Faça um Programa que verifique se uma letra digitada é vogal ou
	 * consoante.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String letra;

		System.out.println("Entre com uma letra: ");
		letra = scan.nextLine();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");

		}else if(letra.length() > 1){
			System.out.println("Não é uma letra válida.");
			
		}else {
			System.out.println("consoante");
		}

		/* outra maneira com o switch */

		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");

		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("vogal");
				break;
			default:
				System.out.println("consoante");

			}
		}

	}

}
