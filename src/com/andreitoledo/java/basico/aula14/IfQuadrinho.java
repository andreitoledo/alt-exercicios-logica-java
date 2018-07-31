package com.andreitoledo.java.basico.aula14;

public class IfQuadrinho {
	
	public static void main(String[] args) {
		// vá ao mercado, se tiver batata traga 9, se não tiver traga 6 ovos.
		
		boolean temBatata = false;
		boolean temOvos= false;		
				
		int batata = 9;
		int ovo = 6;		
		
		if(temBatata){
			batata = 9;
			System.out.println("Compra " + batata + " batatas.");
			
		}else if(temOvos){
			ovo = 6;
			System.out.println("Compra " + ovo + " ovos.");
			
		}else {
			System.out.println("Desculpa, não tinha batata e nem ovos.");
			
		}
		
		
		
	}

}
