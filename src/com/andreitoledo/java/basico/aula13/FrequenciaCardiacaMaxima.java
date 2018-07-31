package com.andreitoledo.java.basico.aula13;

import java.util.Scanner;

public class FrequenciaCardiacaMaxima {
	/**
	 * Calcular a Frequência Cardíaca Máxima (FCM) Fonte: Saúde - iG @
	 * http://saude.ig.com.br/bemestar/calculando-a-frequencia-cardiaca/
	 * n1596962277487.html Para encontrar a sua, subtraia sua idade de 220. Por
	 * exemplo: uma pessoa de 35 anos deve fazer o cálculo 220 – 35 = 185.
	 * Assim, a FCM de uma pessoa de 35 anos é 185 bpm (batimentos por minuto).
	 * * ------------------------------------------------ 
	 * 
	 * */

	private static int ifcm = 220;
	private static int resultado = 0;

	public static int CalculoFcm(int idade) {
		return resultado = ifcm - idade;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Para descobrir sua Frequência Cardíaca Máxima, ");
		System.out.println("entre com a sua idade: ");
		int idade = scan.nextInt();

		System.out.println("Sua frequência Cardíaca máxima é de: " + CalculoFcm(idade) + " FCM");


	}

}
