package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio8 {
	/*
	 * programa que pergunte quanto você ganha por hora e o número de horas
	 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido
	 * mês.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salarioHora;
		double qtdHorasMes;
		double salario;
		
		System.out.println("Entre com o valor do seu salário por hora: ");
		salarioHora = scan.nextDouble();
		
		System.out.println("Entre com a qtd de horas trabalhadas no mês: ");
		qtdHorasMes = scan.nextDouble();
		
		salario = salarioHora * qtdHorasMes;
		
		System.out.println("Seu salário mensal é: " + salario);
	}

}
