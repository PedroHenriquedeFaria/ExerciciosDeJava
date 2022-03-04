package ExerciciosIfElse;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salarioAumentado;
		double valorAumentado;
		System.out.println("Digite seu salário atual: ");
			double salarioAtual = scan.nextDouble();
			if (salarioAtual <= 280) {
				salarioAumentado = salarioAtual+(salarioAtual/100)*20;
				valorAumentado= salarioAumentado - salarioAtual;
						
				System.out.println("Saláro antes do reajuste: "+salarioAtual);	
				System.out.println("Seu salário foi aumentado em 20%.");
				System.out.println("O valor aumentado foi de R$ "+valorAumentado);	
				System.out.println("Saláro após o reajuste: R$ "+salarioAumentado);	
			}
			
			if (salarioAtual > 280 && salarioAtual <= 700) {
				salarioAumentado = salarioAtual+(salarioAtual/100)*15;
				valorAumentado= salarioAumentado - salarioAtual;
						
				System.out.println("Saláro antes do reajuste: "+salarioAtual);	
				System.out.println("Seu salário foi aumentado em 15%.");
				System.out.println("O valor aumentado foi de R$ "+valorAumentado);	
				System.out.println("Saláro após o reajuste: R$ "+salarioAumentado);	
			}
			
			if (salarioAtual >= 700 && salarioAtual < 1500) {
				salarioAumentado = salarioAtual+(salarioAtual/100)*10;
				valorAumentado= salarioAumentado - salarioAtual;
						
				System.out.println("Saláro antes do reajuste: "+salarioAtual);	
				System.out.println("Seu salário foi aumentado em 10%.");
				System.out.println("O valor aumentado foi de R$ "+valorAumentado);	
				System.out.println("Saláro após o reajuste: R$ "+salarioAumentado);	
			}
			
			if (salarioAtual >= 1500) {
				salarioAumentado = salarioAtual+(salarioAtual/100)*5;
				valorAumentado= salarioAumentado - salarioAtual;
						
				System.out.println("Saláro antes do reajuste: "+salarioAtual);	
				System.out.println("Seu salário foi aumentado em 5%.");
				System.out.println("O valor aumentado foi de R$ "+valorAumentado);	
				System.out.println("Saláro após o reajuste: R$ "+salarioAumentado);	
			}
			
			
	}

}
