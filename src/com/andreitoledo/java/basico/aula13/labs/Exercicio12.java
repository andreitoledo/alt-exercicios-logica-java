package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {
	/*
	 * Tenho como dados de entrada a altura de uma pessoa, construa um algoritmo
	 * que calcule seu peso ideal, usando a seguinte fórmula: 
	 * (72.7 * altura) - 58
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double altura;
		double peso;
		
		System.out.println("Entre com sua altura: ");
		altura = scan.nextDouble();
		
		peso = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal para a altura de " + altura + " é: " + peso);

	}
}
