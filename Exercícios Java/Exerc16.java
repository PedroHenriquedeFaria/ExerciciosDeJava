package Aula19;

import java.util.Scanner;

public class Exerc16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int somaInf15 = 0;
		int somaSup15 = 0;
		int igual15 = 0;
		int quantSup15 = 0;
		double media = 0;
		
		
		
		for(int i = 0; i< A.length; i++) {
			
			System.out.println("Digite o "+ (i+1) +"° valor de A: ");
			A[i] = scan.nextInt();
			
			if(A[i] < 15 ) {
				somaInf15 += A[i];
				
			}else if(A[i] == 15){
				
				igual15 += 1;
				
			}else {
				
				somaSup15 += A[i];
				quantSup15 += 1;
				
			}
			

						
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i< A.length; i++) {
			
			System.out.print(A[i]+" ");
						
		}
		
		media = somaSup15/quantSup15;
		
		
		System.out.println("\nA soma dos números inferiores a 15 é: "+ somaInf15 );
		System.out.println("Quantidade de elementos iguais a 15: "+ igual15 );
		System.out.println("A média dos números superiores a 15 é: "+media);
	}
}
