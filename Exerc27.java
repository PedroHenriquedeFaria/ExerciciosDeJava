package Aula19;

import java.util.Scanner;

public class Exerc27 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] A = new int[10];
			char[] B = new char[A.length];
			
			
			System.out.print("Vetor A: ");
			for(int i = 0; i < A.length; i++) {
				
			A[i] = 1+(int)(Math.random()*13);
				
			System.out.print(A[i]+" ");	
			
			}
			
			System.out.print("\nVetor B: ");
			for(int i = 0; i < A.length; i++) {
				
			if(A[i] < 7) {
				
				B[i] = 'a';
				
			}else if(A[i] == 7) {
				
				B[i] = 'b';
				
			}else if(A[i] > 7 && A[i] < 10) {
				
				B[i] = 'c';
				
			}else if(A[i] == 10) {
				
				B[i] = 'd';
				
			}else{
				
				B[i] = 'e';
				
			}
				
			System.out.print(B[i]+" ");	
			}
				
			
	}
}
