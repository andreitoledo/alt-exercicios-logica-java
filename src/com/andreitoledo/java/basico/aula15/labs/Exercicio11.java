package com.andreitoledo.java.basico.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * As Organizações Tabajara resolveram dar um aumento de salário aos seus
	 * colaboradores e lhe contraram para desenvolver o programa que calculará
	 * os reajustes.
	 * 
	 * - Faça um programa que recebe o salário de um colaborador e o reajuste
	 * segundo o seguinte critério, baseado no salário atual: - salários até R$
	 * 280,00 (incluindo) : aumento de 20% - salários entre R$ 280,00 e R$
	 * 700,00 : aumento de 15% - salários entre R$ 700,00 e R$ 1500,00 : aumento
	 * de 10% - salários de R$ 1500,00 em diante : aumento de 5% Após o aumento
	 * ser realizado, informe na tela: - o salário antes do reajuste; - o
	 * percentual de aumento aplicado; - o valor do aumento; - o novo salário,
	 * após o aumento.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double salario;
		double salarioAjustado = 0;
		int percentual = 0;
		double aumento;

		System.out.println("Entre com o salário atual: ");
		salario = scan.nextDouble();

		if (salario <= 280) {
			percentual = 20;

		} else if (salario > 280 && salario < 700) {
			percentual = 15;

		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;

		} else if (salario >= 1500) {
			percentual = 5;
		}

		aumento = (salario / 100) * percentual;
		salarioAjustado = salario + aumento;

		System.out.println("Salário: " + salario);
		System.out.println("Percentual: " + percentual);
		System.out.println("Aumento: " + aumento);
		System.out.println("Salário ajustado: " + salarioAjustado);

	}

}
