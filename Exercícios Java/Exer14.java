package ExerciciosIfElse;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media >= 9 && media <= 10) {
			System.out.println("|PRIMEIRA NOTA: "+nota1+"|");
			System.out.println("|SEGUNDA NOTA:  "+nota2+"|");
			System.out.println("|MÉDIA:         "+media+"|");
			System.out.println("|CONCEITO:     A   |");
			System.out.println("|SITUAÇÃO: APROVADO|");
					
		}else if(media < 9 && media >= 7.5) {
			System.out.println("|PRIMEIRA NOTA: "+nota1+"|");
			System.out.println("|SEGUNDA NOTA:  "+nota2+"|");
			System.out.println("|MÉDIA:         "+media+"|");
			System.out.println("|CONCEITO:      B  |");
			System.out.println("|SITUAÇÃO: APROVADO|");
			
			}else if(media < 7.5 && media >= 6) {
				System.out.println("|PRIMEIRA NOTA: "+nota1+"|");
				System.out.println("|SEGUNDA NOTA:  "+nota2+"|");
				System.out.println("|MÉDIA:         "+media+"|");
				System.out.println("|CONCEITO:      C  |");
				System.out.println("|SITUAÇÃO: APROVADO|");
				
				}else if(media < 6 && media >= 4) {
					System.out.println("|PRIMEIRA NOTA:  "+nota1+"|");
					System.out.println("|SEGUNDA NOTA:   "+nota2+"|");
					System.out.println("|MÉDIA:          "+media+"|");
					System.out.println("|CONCEITO:       D  |");
					System.out.println("|SITUAÇÃO: REPROVADO|");
					
					}else if(media < 4) {
						System.out.println("|PRIMEIRA NOTA:  "+nota1+"|");
						System.out.println("|SEGUNDA NOTA:   "+nota2+"|");
						System.out.println("|MÉDIA:          "+media+"|");
						System.out.println("|CONCEITO:       E  |");
						System.out.println("|SITUAÇÃO: REPROVADO|");
						
							}else if(media > 10) {
								System.out.println("----------------------------------------------");
								System.out.println("|VERIFIQUE SE DIGITOU OS VALORES CORRETAMENTE|");
								System.out.println("----------------------------------------------");
								System.out.println("| MÉDIA: " +media+"|");
									}
			
						
		

	}

}
