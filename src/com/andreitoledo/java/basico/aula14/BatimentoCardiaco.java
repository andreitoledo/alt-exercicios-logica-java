package com.andreitoledo.java.basico.aula14;

import java.util.Scanner;

public class BatimentoCardiaco {

	/**
	 * Calcular os Batimentos Cardíacos por minuto (bpm) Ao encontrar o pulso
	 * Conte os batimentos por 10 segundos e multiplique por 6. O resultado é o
	 * número de batimentos por minuto *
	 * ------------------------------------------------ 10 a 50 bpm Bradicardia
	 * Sensação de fraqueza, com espaço de tempo maior entre os batimentos
	 * cardíacos ; 60 a 100 bpm Normal ; 110 a 140 Taquicardia Sensação de
	 * coração acelerado, com batimentos cardíacos mais rápidos
	 * 
	 * até 2 anos entre 8 a 17 adulto sedentário idosos e adultos que se
	 * exercitam
	 * 
	 */

	private static int i = 6;
	private static int resultado = 0;

	public static int CalculoBpm(int bpm) {
		return resultado = bpm * i;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Faz exercícios com frequênca ? ");
        System.out.println("(digite 'true' para sim ou 'false' para não) ");
		boolean exercicio = scan.nextBoolean();

		System.out.println("Encontre seu pulso, conte os batimentos por 10 seguntdos.");
		System.out.println("");
		System.out.println("Digite o resultado da contagem: ");

		int bpm = scan.nextInt();
		System.out.println("O número de batimentos por minuto é de: " + CalculoBpm(bpm) + " bpm");

		// análise da frequência
		System.out.println();

		if (resultado >= 10 && resultado <= 50) {
			System.out.println("Atenção ! Bradicardia.");
			System.out.println("Sensação de fraqueza, com espaço de tempo maior entre os batimentos cardíacos.");
		} else if (resultado >= 51 && resultado <= 59) {
			System.out.println("Atenção ! quase uma Bradicardia.");
		} else if (resultado >= 60 && resultado <= 100) {
			System.out.println("Parabéns, frequência normal.");
		} else if (resultado >= 101 && resultado <= 109) {
			System.out.println("Cuidado ! Querendo subir demais...");
		} else if (resultado >= 110 && resultado <= 140) {
			System.out.println("Emergência !!! Taquicardia !!!");
			System.out.println("Sensação de coração acelerado, com batimentos cardíacos mais rápidos");
		} else {
			System.out.println("na pindaíba.");
		}

		/* melhor frequência para cada idade */
		System.out.println();
		System.out.println("A frequencia ideal para sua idade é:");
		
		if (idade <= 2) {
			System.out.println("120 a 140 bpm");			
		} else if(idade >= 8 && idade <= 17) {
			System.out.println("80 a 100 bpm");

		} else if(idade >= 18 && exercicio == false){
			System.out.println("70 a 80 bpm");
		} else if(idade >= 21 && exercicio == true){
			System.out.println("50 a 60 bpm");
		}

	}

}
