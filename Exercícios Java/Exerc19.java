package Aula19;

import java.util.Scanner;

public class Exerc19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[nota1.length];
		
		for(int i = 0; i < nota1.length; i++) {
			
			System.out.println("Digite a primeira e a segunda nota do "+(i+1) + "° aluno: ");
			nota1[i] = scan.nextDouble();
			nota2[i] = scan.nextDouble();
			result[i] = (nota1[i]+nota2[i])/2;
			
		}
		
		System.out.println("RESULTADOS:");
		for(int i = 0; i < nota1.length; i++) {
			
			System.out.println("\n"+(i+1)+"° Aluno:");
			System.out.println("Primeira nota: "+nota1[i]);
			System.out.println("Segunda nota: "+nota2[i]);
			System.out.println("Média: "+result[i]);
			
			if(result[i] >= 7) {
				System.out.println("Situação: APROVADO");
			}else {
					System.out.println("Situação: REPROVADO");
				}
			}
	
		
	}

}
