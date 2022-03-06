package Aula19;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer9teste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		int[] B = new int[A.length];
		
		double[] C = new double[A.length];
		
		for(int i = 0; i< A.length; i++) {
			
			System.out.println("Digite o "+ (i+1) +" valor de A: ");
			A[i] = scan.nextInt();
						
		}
		
		for(int i = 0; i< B.length; i++) {
			
			System.out.println("Digite o "+ (i+1) +" valor de B: ");
			B[i] = scan.nextInt();
			
			
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i< A.length; i++) {
			
			System.out.print(A[i]+" ");
						
		}
		
		System.out.print("\nVetorB: ");
		for(int i = 0; i< B.length; i++) {
			
			System.out.print(B[i]+" ");
						
		}

		DecimalFormat format = new DecimalFormat("###,###.##");
		
		System.out.print("\nVetorC: ");
		
		for(int i = 0; i< C.length; i++) {
			
			C[i] = A[i] / B[i];
			
			System.out.print(format.format(C[i])+" ");
			
		}
		
		
	}
}
	