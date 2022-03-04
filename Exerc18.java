
package Aula19;

import java.util.Scanner;

public class Exerc18 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int posicaoMaior = 0;
		int posicaoMenor = 0;

		for(int i = 0; i < idades.length; i++) {
			
			System.out.println("Digite a idade da "+(i+1)+"° pessoa: ");
			idades[i] = scan.nextInt();
			
			if(idades[i] > maior) {
				maior = idades[i];
				posicaoMaior = i+1;
				
			}
			
			if(idades[i] < menor) {
				menor = idades[i];
				posicaoMenor = i+1;
				
			}
			
			
		
			}
		
		System.out.print("Idades digitadas: ");
		for(int i = 0; i < idades.length; i++) {
			
			System.out.print(idades[i] + " ");
	
			}
		System.out.println("\nMaior idade digitada: "+maior);
		System.out.println("Posição: "+posicaoMaior);
		System.out.println("\nMenor idade digitada: "+menor);
		System.out.println("Posição: "+posicaoMenor);
		
		
		
		
		
		
	}

}
