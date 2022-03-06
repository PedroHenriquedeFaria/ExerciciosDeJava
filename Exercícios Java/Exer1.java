package Aula19;


public class Exer1 {
	
	public static void main(String[] args) {	

		int[] A = new int[5];
		int[] B = new int[5];
		A[0] = 1;
		A[1] = 22;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i];
			
		}
		
		System.out.println(B[0]);
		System.out.println(B[1]);
		System.out.println(B[2]);
		System.out.println(B[3]);
		System.out.println(B[4]);

		
	}

}
