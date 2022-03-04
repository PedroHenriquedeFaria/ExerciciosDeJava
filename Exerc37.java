package Aula19;

public class Exerc37 {
	
	public static void main(String[] args) {
		
		int[] A = new int[5];
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			
			A[i] = 1+(int)(Math.random()*10);
			B[i] = A[i];
			for(int j = A[i]-1; j>0; j--) {
				
				B[i] *= j;
				
			}	
		}
		
		System.out.println("Vetor A: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");		
		}
		
		System.out.println("\nVetor B: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i]+" ");		
		}
		
		
	}

}
