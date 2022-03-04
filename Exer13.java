package ExerciciosIfElse;

import java.util.Scanner;

public class Exer13 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o dia da semana? [1 a 7]");
		
		int dia = scan.nextInt();
		
		
		switch(dia){
		case 1: System.out.println("Hoje é Domingo.");break;
		case 2: System.out.println("Hoje é Segunda-feira.");break;
		case 3: System.out.println("Hoje é Terça-feira.");break;
		case 4:	System.out.println("Hoje é Quarta-feira.");break;
		case 5:	System.out.println("Hoje é Quinta-feira.");break;
		case 6:	System.out.println("Hoje é Sexta-feira.");break;
		case 7:	System.out.println("Hoje é Sábado.");break;
		default: System.out.println("A semana só possui 7 dias.");
		
		}
		
		switch(dia){
		case 2: 
		case 3:
		case 4:	
		case 5:	
		case 6:	System.out.println("Dia útil.");break;
		case 1:
		case 7:	System.out.println("Fim de semana");break;
		default: System.out.println("Valor inválido.");
		
		}
	}

}
