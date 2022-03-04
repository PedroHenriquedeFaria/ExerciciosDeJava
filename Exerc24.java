package Aula19;

import java.util.Scanner;

public class Exerc24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		int[] A = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Digite o "+(i+1)+"° algarismo.");
			A[i] = scan.nextInt();	
			
		}

		for(int i = 0, j = 9; i < A.length && continuar == true; i++, j--) {
			
			if(A[i] != A[j]) {
				continuar = false;

			}
			
		}
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.print(A[i]+" ");

			
		}
		
		if(continuar == true) {
			System.out.println("\nÉ um número palindromo.");
		}else {
			System.out.println("\nNão é um número palindromo.");
			
		}
	
	}

}
