package ExerciciosIfElse;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 double resultado = 1;
		 boolean verdadeiro = true;
		 
		
		System.out.println("Digite um número: ");
		
		double numero = scan.nextDouble();
		
		System.out.println("Digite outro número: ");
		
		double numero2 = scan.nextDouble();
		
		System.out.println("Qual operação deseja realizar? [-,+,/,*] ");
		
		String operacao = scan.next();
		
		switch (operacao) {
		
		case "-":  resultado = numero - numero2;
		
		System.out.println("O resultado desse operação é igual a : "+ resultado);break;
			
		case "+":  resultado = numero + numero2;
		
		System.out.println("O resultado desse operação é igual a : "+ resultado);break;
			
		case "/":  resultado = numero / numero2;
		
		System.out.println("O resultado desse operação é igual a : "+ resultado);break;
			
		case "*":  resultado = numero * numero2;
		
		System.out.println("O resultado desse operação é igual a : "+ resultado);break;
		
		default: System.out.println("Operação inválida.");
		verdadeiro = false;
		
		}
		
		if (verdadeiro == true) {
		
			if (resultado % 2 == 0) {
				System.out.println("É um número par.");
				
				}else {
					System.out.println("É um número impar.");
					
					}
			
			 if (resultado < 0) {
				System.out.println("É um número negativo.");
				}else {
				System.out.println("É um número positivo.");
					}
		
					
		}
		

	}

}