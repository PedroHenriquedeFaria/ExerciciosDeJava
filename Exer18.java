package ExerciciosIfElse;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			
			System.out.println("� um n�mero par.");
		}else {
			System.out.println("� um n�mero impar.");
		}

	}

}
