package Aula19;

import java.util.Scanner;

public class Exerc31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[20];
		int[] B = new int[40];
		int i = 0;
		int j = 20;
		
		do {
			
			System.out.println("Digite o "+(i+1)+"° número: ");
			A[i] = 1+(int)(Math.random()*50);
			
			if(A[i] % 2 == 0) {
				
				B[i] = A[i];
			}else {
				B[j] = A[i];
				j++;
				
			}
	
		i++;	
			
		}while(i< A.length);
		
		System.out.println("Números pares e impares digtados: ");
		for(int k = 0; k < B.length; k++) {
			
			if(B[k] != 0) {
				
				System.out.print(B[k]+" ");
				
			}
			
			
		}
		
		
		
		
	}
}
