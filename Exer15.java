package ExerciciosIfElse;

import java.util.Scanner;

public class Exer15 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do tri�ngulo: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o segundo lado do tri�ngulo: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro lado do tri�ngulo: ");
		double lado3 = scan.nextDouble();
		
		
		if (lado1 + lado2 > lado3 || lado2+lado3 > lado1 || lado3+ lado1 > lado2 ) {
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Esse � um tri�ngulo equil�tero.");
				
				}else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
				System.out.println("Esse � um tri�ngulo is�celes.");
				
					}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
						System.out.println("Esse � um tri�ngulo escaleno.");
					}
			
			
		}else {
			
			System.out.println("Os n�meros digitados n�o condizem com lados de tri�ngulos.")	;
			
			}
				
	}
	
	
}
