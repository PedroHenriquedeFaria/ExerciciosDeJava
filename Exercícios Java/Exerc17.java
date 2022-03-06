package Aula19;

import java.util.Scanner;

public class Exerc17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int quantidade = 0;
		
		for(int i = 0; i < idades.length; i++) {
			
			System.out.println("Digite a idade da "+(i+1)+"° pessoa: ");
			idades[i] = scan.nextInt();
			
			if(idades[i] > 35) {
				
				quantidade += 1;
				
			}
			
			
		}
		
		System.out.print("Idades digitadas: ");
		for(int i = 0; i < idades.length; i++) {
			
			System.out.print(idades[i] + " ");
	
			}
		System.out.print("\nForam digitadas "+quantidade+ " idades maiores a 35.");
		
		
		
		
		
		
		
	}

}
