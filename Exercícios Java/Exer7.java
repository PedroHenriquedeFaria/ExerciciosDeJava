package ExerciciosIfElse;

import java.util.Scanner;

public class Exer7 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		double number1 = scan.nextDouble();
		System.out.println("Digite outro n�mero: ");
		double number2 = scan.nextDouble();
		System.out.println("Digite outro n�mero: ");
		double number3 = scan.nextDouble();
		
		if (number1 >= number2 && number1 >= number3) {
			System.out.println("O maior n�mero digitado foi: "+number1);
			
				}if (number2 >= number1 && number2 >= number3) {
							System.out.println("O maior n�mero digitado foi: "+number2);
							
						}else if (number3 >= number1 && number3 >= number2) {
							System.out.println("O maior n�mero digitado foi: "+number3);
							
						}

		if (number1 <= number2 && number1 <= number3) {
			System.out.println("O menor n�mero digitado foi: "+number1);
							
									
				}else if (number2 <= number1 && number2 <= number3) {
					System.out.println("O menor n�mero digitado foi: "+number2);
											
					}else if (number3 <= number1 && number3 <= number2) {
						System.out.println("O menor n�mero digitado foi: "+number3);
											
						}
						
						
						
						
	}

}