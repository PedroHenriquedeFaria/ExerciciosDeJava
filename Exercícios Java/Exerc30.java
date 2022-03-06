package Aula19;

import java.util.Scanner;

public class Exerc30 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[20];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		for(int i = 0; i <A.length; i++) {
			System.out.println("Digite o "+(i+1)+"° número: ");
			A[i] = scan.nextInt();
			
			if(A[i]%2 == 0) {
				B[i] = A[i];
				
			}else {
				C[i] = A[i];
				
			}
		
		}
		System.out.print("Números digitados: ");
		for(int i = 0; i <A.length; i++) {
			System.out.print(A[i]+" ");
			
		}
		System.out.print("\nNúmeros pares digitados: ");
		for(int i = 0; i <A.length; i++) {
			if(B[i]!=0) {
			System.out.print(B[i]+" ");
			}
			
		}
		System.out.print("\nNúmeros impares digitados: ");
		for(int i = 0; i <A.length; i++) {
			if(C[i] != 0) {
			System.out.print(C[i]+" ");
			}
			
		}
		
	}

}
