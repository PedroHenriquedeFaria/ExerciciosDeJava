package ExerciciosIfElse;

import java.util.Scanner;

public class Exer15 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o segundo lado do triângulo: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro lado do triângulo: ");
		double lado3 = scan.nextDouble();
		
		
		if (lado1 + lado2 > lado3 || lado2+lado3 > lado1 || lado3+ lado1 > lado2 ) {
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Esse é um triângulo equilátero.");
				
				}else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
				System.out.println("Esse é um triângulo isóceles.");
				
					}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
						System.out.println("Esse é um triângulo escaleno.");
					}
			
			
		}else {
			
			System.out.println("Os números digitados não condizem com lados de triângulos.")	;
			
			}
				
	}
	
	
}
