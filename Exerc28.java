package Aula19;

import java.util.Scanner;

public class Exerc28 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for(int i = 0, j = 9; i < A.length; i++, j--) {
			
			System.out.println("Digite o valor da posição "+i+" de A: ");
			A[i] = scan.nextInt();
			B[j] = A[i];
			
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
			
		}
		System.out.print("\nVetor A invertido: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i]+" ");
			
		}
		
		
		
		
	}

}
