package ExerciciosIfElse;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media >= 7 && media < 10) {
			System.out.println("----------");
			System.out.println("|APROVADO|");
			System.out.println("----------");
			System.out.println("| MÉDIA: " +media+"|");
		}else if(media < 7) {
			System.out.println("----------");
			System.out.println("|REPROVADO|");
			System.out.println("----------");
			System.out.println("| MÉDIA: " +media+"|");
			}else if(media == 10) {
				System.out.println("------------------------");
				System.out.println("|APROVADO COM DISTINÇÃO|");
				System.out.println("------------------------");
				System.out.println("| MÉDIA: " +media+"|");
				}else if(media > 10) {
					System.out.println("----------------------------------------------");
					System.out.println("|VERIFIQUE SE DIGITOU OS VALORES CORRETAMENTE|");
					System.out.println("----------------------------------------------");
					System.out.println("| MÉDIA: " +media+"|");
					}
		

	}

}
