package Aula19;

import java.util.Scanner;

public class Exerc25 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] A = new int[10];
			int[] B = new int[A.length];
			
			for(int i = 0; i < A.length; i++) {
				
				System.out.println("Digite o valor da posição "+i);
				A[i] = scan.nextInt();
				
				if(A[i]%2 == 0) {
					
					B[i] = 1;
					
				}else {
					
					B[i] = 0;
				}	
				
			}
			
			System.out.print("Vetor A: ");
			for(int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");	
			}
			
			System.out.print("\nVetor B: ");
			for(int i = 0; i < A.length; i++) {
			System.out.print(B[i]+" ");	
			}
				
			
	}
}
