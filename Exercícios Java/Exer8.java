package ExerciciosIfElse;

import java.util.Scanner;

public class Exer8 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o preço do primero produto: ");
		double number1 = scan.nextDouble();
		System.out.println("Digite o preço do segundo produto: ");
		double number2 = scan.nextDouble();
		System.out.println("Digite o preço do terceiro produto: ");
		double number3 = scan.nextDouble();
		
		
	 if (number1 == number2 && number1 == number3)  {
		System.out.println("Os três preços são iguais.");

	 	}else if (number1 <= number2 && number1 <= number3) {
			System.out.println("O produto com menor preço é o primeiro (R$ "+number1+").");
							
									
				}else if (number2 <= number1 && number2 <= number3) {
					System.out.println("O produto com menor preço é o segundo (R$ "+number2+").");
											
					}else if (number3 <= number1 && number3 <= number2) {
						System.out.println("O produto com menor preço é o primeiro (R$ "+number3+").");
											
						}
						
						
						
						
	}

}