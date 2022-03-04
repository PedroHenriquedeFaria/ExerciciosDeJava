package ExerciciosIfElse;

import java.util.Scanner;

public class Exer7 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double number1 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		double number2 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		double number3 = scan.nextDouble();
		
		if (number1 >= number2 && number1 >= number3) {
			System.out.println("O maior número digitado foi: "+number1);
			
				}if (number2 >= number1 && number2 >= number3) {
							System.out.println("O maior número digitado foi: "+number2);
							
						}else if (number3 >= number1 && number3 >= number2) {
							System.out.println("O maior número digitado foi: "+number3);
							
						}

		if (number1 <= number2 && number1 <= number3) {
			System.out.println("O menor número digitado foi: "+number1);
							
									
				}else if (number2 <= number1 && number2 <= number3) {
					System.out.println("O menor número digitado foi: "+number2);
											
					}else if (number3 <= number1 && number3 <= number2) {
						System.out.println("O menor número digitado foi: "+number3);
											
						}
						
						
						
						
	}

}