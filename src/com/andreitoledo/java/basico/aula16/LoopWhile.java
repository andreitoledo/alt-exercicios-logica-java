package com.andreitoledo.java.basico.aula16;

public class LoopWhile {
	
	public static void main(String[] args) {
		
		// imprimir na tela números de 0 a 10
		
		int i = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		// primeiro avalia a expressão, depois executa o código.
		while (i <= max) {	
			System.out.println("Resultado :" + i); 
			i++; // i = i + 1; u += i;
			
		}
		
		System.out.println(i);  // valor 11
		
		// prmeiro executa o código, depois avalia a expressão
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
		

		
	}

}
