package Aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc20 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###,###.##");
		double cotDolar = 0;
		double[] dolar = new double[20]; 
		
		System.out.println("CONVERSOR US$ x R$");
		
		System.out.println("\nDigite a cota��o do d�lar: ");
		cotDolar = scan.nextDouble(); 
		

		System.out.println("Convers�o:");
		
		for(int i = 0; i< dolar.length; i++) {
			
			dolar[i] = cotDolar * (i+1);
			
			System.out.println((i+1)+" R$ = "+format.format(dolar[i])+" US$");
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
