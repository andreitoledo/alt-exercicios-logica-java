package com.andreitoledo.java.basico.aula17.labs;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		double cont = 0;
		
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		do{
			System.out.println("Entre com a população A:");
			popA = scan.nextDouble();
			
			if(popA > 0){
				valido = true;
				
			} else {
				System.out.println("População precisa ser maior que 0.");
			}			
			
		} while(!valido);
		
		valido = false;
		do{
			System.out.println("Entre com a população B:");
			popB = scan.nextDouble();
			
			if(popB > 0){
				valido = true;
				
			} else {
				System.out.println("População precisa ser maior que 0.");
			}			
			
		} while(!valido);
		
		valido = false;
		do{
			System.out.println("Entre com a taxa de crescimento da população A:");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0){
				valido = true;
				
			} else {
				System.out.println("Taxa precisa ser maior que 0%.");
			}			
			
		} while(!valido);
		
		valido = false;
		do{
			System.out.println("Entre com a taxa de crescimento da população B:");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0){
				valido = true;
				
			} else {
				System.out.println("Taxa precisa ser maior que 0.");
			}			
			
		} while(!valido);
		
		while (popA < popB) {

			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont++;
		}		
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Qtd anos:    " + cont);

	}


}
