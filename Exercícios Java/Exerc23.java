package Aula19;

import java.util.Scanner;

public class Exerc23 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		int[] A = new int[10];
		
		

		for(int i = 0; i < A.length && continuar == true; i++) {
			
			System.out.println("Digite o "+(i+1)+"� n�mero: ");
			A[i] = scan.nextInt();
			
			if(A[i]%2 != 0) {
				
				System.out.println("S� devem ser digitados n�meros pares.");
				continuar = false;
				
				}
		
		}
	
		
	}

}
