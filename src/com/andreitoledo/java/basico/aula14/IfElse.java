package com.andreitoledo.java.basico.aula14;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com sua idade");		
		int idade = scan.nextInt();		
		if(idade >=18 & idade < 150){
			System.out.println("É maior de idade.");
		}else if(idade < 18){
			System.out.println("É menor de idade.");
		}else if(idade >= 150){
			System.out.println("Idade inválida.");
		}*/
		
		
		System.out.println("Entre com um valor ");
		double valor = scan.nextDouble();	
		
		if(valor <= 10){
			System.out.println("O preço está bom, compra !");
		}else if(valor > 10 && valor < 15){
			System.out.println("Pedir desconto.");
		}else if(valor >= 15 && valor < 17){
			System.out.println("Pedir mais desconto.");
		}else { // valor >= 17
			System.out.println("Muito caro, saia fora !");
		}
		
	}

}
