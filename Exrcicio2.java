package ExerciciosIfElse;

import java.util.Scanner;

public class Exrcicio2 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		double valor = scan.nextDouble();
		
		if (valor < 0 ) {
			System.out.println("Esse valor é negativo.");
			} else if (valor > 0) {
			System.out.println("Esse valor é positivo");
				} else {
					System.out.println("Esse valor é um valor neutro");
					}
					

	}

}
