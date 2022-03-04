package Aula20;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int[][] A = new int[4][4];
		int maiorValor = -1;
		int linha = 0;
		int coluna = 0;
		
		for(int i = 0; i < A.length; i++) {
			
			for(int j = 0; j < A[i].length; j++) {
				
				A[i][j] = 0+(int)(Math.random()*10);
				
				System.out.print(A[i][j]+" ");
				if(A[i][j] > maiorValor) {
					maiorValor = A[i][j];
					linha = i;
					coluna = j;
					
				}
				
			}
			
			System.out.println(" ");
		}
		
		System.out.println("\nMaior valor: "+maiorValor);
		System.out.println("Linha "+linha+" Coluna "+coluna);
		
	}

}
