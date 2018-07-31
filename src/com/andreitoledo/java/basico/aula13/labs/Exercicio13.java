package com.andreitoledo.java.basico.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	/*
	 * faça um programa que pergunte quanto vc ganha por hora e o numero de
	 * horas trabalhadas no mes. Calcule e mostre o total do seu salario no
	 * referido mes, sabendo-se que são descontados 11% para o imposto de renda,
	 * 8% para o INSS e 5% para o sindicato.
	 * 
	 * faça um programa que nos dê:
	 * 
	 * salário bruto a. quanto pagou ao INSS b. quanto pagou ao sindicato c. o
	 * salario liquido d. calcule os descontos e o salário liquido, confirme a
	 * tabela abaixo;
	 */

	/*
	 * + salario bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - sindicato (5%) :
	 * R$ = salario liquido : R$
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a qtd de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("Salario líquido: " + salarioLiquido);

	}

}
