package Aula19;

import java.util.Scanner;

public class Exerc33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] A = new int[5];
		boolean primo = true;
		
		for(int i = 0; i <A.length; i++) {
			
			primo = true;
			
			System.out.println("Digite um número para verificar se é primo: ");
			A[i] = scan.nextInt();
			
			for(int j = 2; j < A[i]; j++) {
				
				if(A[i] % j == 0) {
					primo = false;
					break;
					
				}
	
			}
			
			if(primo == true) {
			System.out.println(A[i]+" é um número primo.");
			}else {
				System.out.println(A[i]+" não é um número primo.");
				
			}
			
			
		}
		
		
		
	}
}
