package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		double number1 = scan.nextDouble();
		System.out.println("Digite outro n�mero: ");
		double number2 = scan.nextDouble();
		
		if (number1 > number2) {
			System.out.println("O maior n�mero digitado foi: "+number1);
			
				}else if (number1 == number2)  {
					System.out.println("Os dois n�meros digitados foram iguais.");
					
						}else {
								System.out.println("O maior n�mero digitado foi: "+number2);
								}
						
	}

}
