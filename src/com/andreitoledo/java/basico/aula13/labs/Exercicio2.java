package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio2 {
	/* peça o numer e então mostre a mensagem O numero informado foi [numero] */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numero; 
		
		System.out.println("Entre com um número: ");
		numero = scan.nextInt();
		
		System.out.println("O número informado foi " + numero);
				
		

	}

}
