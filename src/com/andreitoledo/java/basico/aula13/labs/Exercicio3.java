package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio3 {
	
	/*peça dois numeros e imprima a soma*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1;
		int numero2;
		double soma;
		
		System.out.println("Entre com o primeiro numero: ");
		numero1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		numero2 = scan.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println(soma);
		
	}
	

}
