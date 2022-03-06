package Aula19;

public class Exerc22 {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		int i = 0;
		int quant0 = 0;
		int quant1 = 0;
		
		do {
			
		A[i]= (int)Math.round(Math.random()*1);
		System.out.print(A[i]+" ");
		
		if(A[i] == 0 ) {
			
			quant0 += 1;
			
		}else {
			quant1 += 1;
		}
			
		i++;
			
		}while(i< A.length);
		
		System.out.println("\nPercentual de números 0 gerados: "+quant0*10+"%.");
		System.out.println("Percentual de números 1 gerados: "+quant1*10+"%.");
		
	}
}
