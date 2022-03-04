package Aula20;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][]mes = new String[31][24];
		int diaMes = 0;
		int horaDia = 0;
		int dia = 0;
		int hora = 0;
		boolean continuar = false;
		String compromisso;
		
		for(int i = 0; i < mes.length; i++) {	
			for(int j = 0; j< mes[i].length;j++) {				

					
					mes[i][j]="";
					
				}
			}
	
		do {
		System.out.println("=================================================");
		System.out.println("Para adicionar um compromisso, digite 1.");
		System.out.println("Caso deseje consultar um dia específico, digite 2.");
		System.out.println("Caso deseje imprimir toda a agenda, digite 3.");
		System.out.println("Caso deseje sair, digite 4.");
		System.out.println("=================================================");
		int escolha = scan.nextInt();
		
		switch(escolha) {
		
		case 1:
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
			
			mes[diaMes][horaDia] = (compromisso);
			
			break;
	
		case 2:
			do {
			System.out.println("Deseja consultar qual dia?");
			dia = scan.nextInt();
			dia -= 1;
			if(dia > 30 || dia < 0) {
				System.out.println("Digite um valor de 1 a 31.");
				}
			}while(dia > 30 || dia < 0);
			
			do {
			System.out.println("Qual horario?");
			hora= scan.nextInt();
			hora -= 1;
			if(hora> 23 || hora < 0) {
				System.out.println("Digite um valor de 1 a 24.");
			}
			
			}while(hora> 23 || hora < 0);
			
			
			System.out.println("Compromisso marcado: "+mes[dia][hora]);
		
			break;
			
		case 3:
			for(int i = 0; i < mes.length; i++) {
				System.out.print("Dia "+(i+1)+" Horário: ");
				
				for(int j = 0; j< mes[i].length;j++) {
					System.out.print("|"+(j+1));
					

						System.out.print(mes[i][j]);
						
					}
				System.out.println(" ");
				
				}break;
			
		case 4:
			System.out.print("Tenha um bom dia!");
			continuar = true;break;
			
		default:	
			System.out.println("Digite um valor válido!\n");

			}
		
		
		}while(continuar == false);
			
	
	}

}
