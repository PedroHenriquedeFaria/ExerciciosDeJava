package ExerciciosIfElse;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 double resultado = 1;
		 boolean verdadeiro = true;
		 
		
		System.out.println("Digite um n�mero: ");
		
		double numero = scan.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		
		double numero2 = scan.nextDouble();
		
		System.out.println("Qual opera��o deseja realizar? [-,+,/,*] ");
		
		String operacao = scan.next();
		
		switch (operacao) {
		
		case "-":  resultado = numero - numero2;
		
		System.out.println("O resultado desse opera��o � igual a : "+ resultado);break;
			
		case "+":  resultado = numero + numero2;
		
		System.out.println("O resultado desse opera��o � igual a : "+ resultado);break;
			
		case "/":  resultado = numero / numero2;
		
		System.out.println("O resultado desse opera��o � igual a : "+ resultado);break;
			
		case "*":  resultado = numero * numero2;
		
		System.out.println("O resultado desse opera��o � igual a : "+ resultado);break;
		
		default: System.out.println("Opera��o inv�lida.");
		verdadeiro = false;
		
		}
		
		if (verdadeiro == true) {
		
			if (resultado % 2 == 0) {
				System.out.println("� um n�mero par.");
				
				}else {
					System.out.println("� um n�mero impar.");
					
					}
			
			 if (resultado < 0) {
				System.out.println("� um n�mero negativo.");
				}else {
				System.out.println("� um n�mero positivo.");
					}
		
					
		}
		

	}

}