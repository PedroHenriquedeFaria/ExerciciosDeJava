package ExerciciosIfElse;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double pre�o = 0;
		
		System.out.println("Quantos litros foram vendidios?");
		float litros = scan.nextFloat();
		
		System.out.println("Qual o tipo do combust�vel? [G/A]");
		String tipo = scan.next();
		
		switch (tipo) {
		
		case "A": 
		case "a":
				if(litros <= 20) {
					 pre�o = (litros * 1.90-litros *1.90/100*3);
				}else {
					 pre�o = (litros * 1.90-litros *1.90/100*5);break;
				}
				
				
				
				
		case "G":
		case "g":
			if(litros <= 20) {
				 pre�o = (litros * 2.50-litros *2.50/100*4);
			}else {
				 pre�o = (litros * 2.50-litros *2.50/100*6);break;
			}
				
			
		}
		
		System.out.println("Valor a ser pago: R$ "+pre�o);
	}

}
