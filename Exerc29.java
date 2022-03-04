package Aula19;

import java.util.Scanner;

public class Exerc29 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length+B.length];
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Digite o valor da posição "+i+" de A: ");
			A[i] = scan.nextInt();	
			
		}
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Digite o valor da posição "+i+" de B: ");
			B[i] = scan.nextInt();	
			
		}
		
		for(int i = 0, j = 10; i < A.length; i++, j++) {
			
			C[i] = A[i];
			C[j] = B[i];
			
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
			
		}
		System.out.print("\nVetor B: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i]+" ");
			
		}
		System.out.print("\nVetor C: ");
		for(int i = 0; i < A.length+B.length; i++) {
			System.out.print(C[i]+" ");
			
		}
		
		
		
		
	}

}
