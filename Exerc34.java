package Aula19;

import java.util.Scanner;

public class Exerc34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for(int i = 0; i< A.length; i++) {
			A[i] = 1+(int)(Math.random()*50);
			System.out.println("\nNúmeros pares de 0 até "+A[i]+":");
				for(int j = 1; j < A[i]; j++) {
					if(j%2 == 0) {
						System.out.print(j+" ");
					}
					
				}
			
		}
		

	}

}
