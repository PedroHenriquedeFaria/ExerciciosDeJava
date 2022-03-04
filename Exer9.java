package ExerciciosIfElse;

import java.util.Scanner;

public class Exer9 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in); 
		double primeiro = 0;
		double segundo = 0;
		double terceiro = 0;
		double naoEscolhido = 0;
		
		System.out.println("Digite o primeiro número: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double numero3 = scan.nextDouble();
		
		
			
		if (numero1 >= numero2 && numero1 >= numero3) {
			primeiro = numero1;
				
			}else if (numero2 >= numero1 && numero2 >= numero3) {
				primeiro = numero2;
				
				}else if (numero3 >= numero1 && numero3 >= numero2) {
					primeiro = numero3;
					}
		
		System.out.println(primeiro);
		
		
		if (primeiro == numero1 && numero2 >= numero3){
			segundo = numero2;
			naoEscolhido = numero3;
			
			} else if (primeiro == numero1 && numero3 >= numero2){
			segundo = numero3;
			naoEscolhido = numero2;
			
			}
		
		if (primeiro == numero2 && numero1 >= numero3){
			segundo = numero1;
			naoEscolhido = numero3;
			
			} else if (primeiro == numero2 && numero3 >= numero1){
			segundo = numero3;
			naoEscolhido = numero1;
			
			}
		
		if (primeiro == numero3 && numero2 >= numero1){
			segundo = numero2;
			naoEscolhido = numero1;
			
			} else if (primeiro == numero3 && numero1 >= numero2){
			segundo = numero1;
			naoEscolhido = numero2;
			}
		
		
		System.out.println(segundo);
						
						
		if (naoEscolhido == numero1) {
			System.out.println(numero1);
			
			}else if (naoEscolhido == numero2) {
			System.out.println(numero2);
			
				}else if (naoEscolhido == numero3) {
				System.out.println(numero3);
				
				}
					
						
	}

}
