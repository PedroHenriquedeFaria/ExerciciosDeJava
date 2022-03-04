package Aula20;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][][]mes = new String[12][31][24];
		int mesAno = 0;
		int diaMes = 0;
		int horaDia = 0;
		int ano = 0;
		int dia = 0;
		int hora = 0;
		boolean continuar = false;
		String compromisso;

		do {
		System.out.println("=================================================");
		System.out.println("Para adicionar um compromisso, digite 1.");
		System.out.println("Caso deseje consultar um dia específico, digite 2.");
		System.out.println("Caso deseje sair, digite 3.");
		System.out.println("=================================================");
		int escolha = scan.nextInt();
		
		switch(escolha) {
		
		case 1:
			do {
			System.out.println("Deseja adicionar a qual mes?");
			mesAno = scan.nextInt();
			mesAno -= 1;
			
				if(mesAno > 11 || mesAno < 0) {
					System.out.println("Digite um valor de 1 a 12.");
					}
			
			}while(mesAno > 11 || mesAno < 0);
			
			do {	
				
			System.out.println("Deseja adicionar a qual dia do mes?");
			diaMes = scan.nextInt();
			diaMes -= 1;
			
				if(diaMes > 30 || diaMes < 0) {
					System.out.println("Digite um valor de 1 a 31.");
					}
			
			}while(diaMes > 30 || diaMes < 0);
			
			do {
			System.out.println("Deseja alterar qual hora do dia?");
			horaDia= scan.nextInt();
			horaDia -= 1;
			if(horaDia> 23 || horaDia < 0) {
				System.out.println("Digite um valor de 1 a 24.");
			}
			
			}while(horaDia> 23 || horaDia < 0);
			
			System.out.println("Qual o compromisso?");
			compromisso = scan.next();
			
			mes[mesAno][diaMes][horaDia] = (compromisso);
			
			break;
	
		case 2:
			
			do {
				System.out.println("Deseja consultar qual mes?");
				ano = scan.nextInt();
				ano -= 1;
				
					if(ano > 11 || ano < 0) {
						System.out.println("Digite um valor de 1 a 12.");
						}
				
				}while(ano > 11 || ano < 0);
				
			
			do {
			System.out.println("Deseja consultar qual dia?");
			dia = scan.nextInt();
			dia -= 1;
			if(dia > 30 || dia < 1) {
				System.out.println("Digite um valor de 1 a 31.");
				}
			}while(dia > 30 || dia < 1);
			
			do {
			System.out.println("Qual horario?");
			hora= scan.nextInt();
			hora -= 1;
			if(hora> 23 || hora < 1) {
				System.out.println("Digite um valor de 1 a 24.");
			}
			
			}while(hora> 23 || hora < 1);
			
			System.out.println("Compromisso marcado: "+mes[ano][dia][hora]);
			
			break;	
			
		
		case 3:
			System.out.print("Tenha um bom dia!");
			continuar = true;break;
			
		default:	
			System.out.println("Digite um valor válido!\n");

			}
		
		
		}while(continuar == false);
			
	
	}

}
