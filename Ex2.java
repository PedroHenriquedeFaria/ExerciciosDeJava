package Aula20;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int[][] A = new int[10][10];
		int maiorValor5 = -1;
		int menorValor5 = 10;
		int maiorValor7 = -1;
		int menorValor7 = 10;
		
		for(int i = 0; i < A.length; i++) {
			
			for(int j = 0; j < A[i].length; j++) {
				
				A[i][j] = 0+(int)(Math.random()*10);
				
				System.out.print(A[i][j]+" ");
				
				if(i == 5 && A[i][j] > maiorValor5) {
					maiorValor5 = A[i][j];
				}
				if(i == 5 && A[i][j] < menorValor5) {
					menorValor5 = A[i][j];
				}
				
				if(j == 7 && A[i][j] > maiorValor7) {
					maiorValor7 = A[i][j];
				}
				if(j == 7 && A[i][j] < menorValor7) {
					menorValor7 = A[i][j];
				}
				
				
				
				
				
			}
			
			System.out.println(" ");
		}
		
		System.out.println("\nMaior valor da linha 5 : "+maiorValor5);
		System.out.println("Menor valor da linha 5 : "+menorValor5);
		System.out.println("\nMaior valor da coluna 7 : "+maiorValor7);
		System.out.println("Menor valor da coluna 7 : "+menorValor7);
		
	}

}
