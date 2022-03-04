package Aula19;

import java.util.Scanner;

public class Exerc32 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] A = new int[5];
		
		System.out.println("=| GERADOR DE TABUADAS |=\n");
		for(int i = 0; i < A.length; i++){
			
			System.out.println("Digite o "+(i+1)+"° número que deseja saber a tabuada: ");
			A[i] = scan.nextInt();
	
		}
		
		for(int i = 0; i< A.length; i++) {
			
			System.out.println("\nTabuada de "+A[i]+":\n");
			for(int j = 1; j<= 10; j++) {
				
			System.out.println(A[i]+" x "+j+" = "+A[i]*j);
			
			}
			
			
		}
		
		
		
	}

}
