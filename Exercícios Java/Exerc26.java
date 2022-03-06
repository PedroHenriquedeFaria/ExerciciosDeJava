package Aula19;

import java.util.Scanner;

public class Exerc26 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] A = new int[10];
			int[] B = new int[A.length];
			int[] C = new int[A.length];
			
			System.out.print("Vetor A: ");
			for(int i = 0; i < A.length; i++) {

				A[i] = 1+ (int)(Math.random()*10);
				System.out.print(A[i]+" ");
				
			}
			
			System.out.print("\nVetor B: ");
			for(int i = 0; i < A.length; i++) {

				B[i] = 1+ (int)(Math.random()*10);
				System.out.print(B[i]+" ");
				
			}
			
			System.out.print("\nVetor C: ");
			for(int i = 0; i < A.length; i++) {

				if(A[i] > B[i]) {
					
					C[i] = 1;
					
				}else if(A[i] == B[i]) {
					
					C[i] = 0;
					
				}else {
					
					C[i] = -1;
					
				}

				System.out.print(C[i]+" ");
				
			}
			
	}
}
