package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double number1 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		double number2 = scan.nextDouble();
		
		if (number1 > number2) {
			System.out.println("O maior número digitado foi: "+number1);
			
				}else if (number1 == number2)  {
					System.out.println("Os dois números digitados foram iguais.");
					
						}else {
								System.out.println("O maior número digitado foi: "+number2);
								}
						
	}

}
