package Aula19;

import java.util.Scanner;

public class Exerc12 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int soma = 0;
		
		
		for(int i = 0; i< A.length; i++) {
			
			System.out.println("Digite o "+ (i+1) +"° valor de A: ");
			A[i] = scan.nextInt();

				soma+= A[i];

						
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i< A.length; i++) {
			
			System.out.print(A[i]+" ");
						
		}
		System.out.print("\nA soma dos valores digitados é: "+soma);
		
	}
}
