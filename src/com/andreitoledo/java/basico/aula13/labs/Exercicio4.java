package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio4 {
	/*peça 4 notas bimestrais e mostre a média.*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		double media;
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		nota3 = scan.nextDouble();
		System.out.println("Entre com a quarta nota: ");
		nota4 = scan.nextDouble();
		
		media = nota1 + nota2 + nota3 + nota4 / 4;
		
		System.out.println("A média das quatro notas foi: " + media);
		
	}

}
