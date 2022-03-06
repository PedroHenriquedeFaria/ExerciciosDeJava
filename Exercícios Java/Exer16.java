package ExerciciosIfElse;

import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("|- EQUAÇÃO DE SEGUNDO GRAU -|");
		System.out.println("=============================");
		System.out.println("");
		System.out.println("Informe o valor de 'A': ");
		int A = scan.nextInt();
		
		if (A == 0) {
			System.out.println("Esta não é uma equação de segundo grau ('A' não pode ser gual a '0').");	
			
		} else {
		
				System.out.println("Informe o valor de 'B': ");
				int B = scan.nextInt();
		
				System.out.println("Informe o valor de 'C': ");
				int C = scan.nextInt();
				
				double delta = Math.pow(B, 2)-4*A*C;
				
				System.out.println("Delta: "+delta);
				
				if (delta< 0) {
					System.out.println("Esta equação não possui raizes reais.");
					
					}else if (delta == 0){
						double raiz = (-B + 0)/(2 * A);
						
						System.out.println("Raiz: "+raiz);
						
						}else if(delta > 0){
							double raiz = (-B + Math.sqrt(delta))/(2 * A);
							
							System.out.println("Primeira raiz: "+raiz);
							
							double raiz2 = (-B - Math.sqrt(delta))/(2 * A);
							
							System.out.println("Segunda raiz: "+raiz2);
							
						}
				}	
		
		
	}	
}
