package Aula19;

import java.util.Scanner;

public class Exerc10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		int[] B = new int[A.length];
		
		
		for(int i = 0; i< A.length; i++) {
			
			System.out.println("Digite o "+ (i+1) +" valor de A: ");
			A[i] = scan.nextInt();
						
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i< A.length; i++) {
			
			System.out.print(A[i]+" ");
						
		}
		
		System.out.print("\nVetorB: ");
		
		for(int i = 0; i< B.length; i++) {
			
			B[i] = A[i] % 2;
			
			System.out.print(B[i]+" ");
			
		}
		
		
	}
}
