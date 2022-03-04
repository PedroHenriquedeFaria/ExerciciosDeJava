package Aula20;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] M = new int[3][3];
		int contPar = 0;
		int contImpar = 0;
		
		for(int i = 0; i<M.length; i++) {
			for(int j = 0; j< M[i].length; j++) {
				
				System.out.println("Digite o valor da posição "+i+" "+j+": ");
				M[i][j] = scan.nextInt();
				
				if(M[i][j]%2 == 0) {
					contPar += 1;
				}else {
					contImpar += 1;
				}
	
			}
	
		}
		
		System.out.println(" ");
		
		for(int i = 0; i<M.length; i++) {
			for(int j = 0; j< M[i].length; j++) {
				System.out.print(M[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		
		System.out.println("\nQuantidade de valores pares: "+contPar);
		System.out.println("Quantidade de valores impares: "+contImpar);
		
	}

}
