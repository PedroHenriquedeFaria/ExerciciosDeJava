package Aula19;

import java.util.Scanner;

public class Exerc35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for(int i = 0; i< A.length; i++) {
			A[i] = 1+(int)(Math.random()*50);
			System.out.println("\nDivisores de "+A[i]+":");
				for(int j = 1; j <= A[i]; j++) {
					if(A[i]%j == 0) {
						System.out.print(j+" ");
					}
					
				}
			
		}
		

	}

}
