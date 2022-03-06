package ExerciciosIfElse;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sexo: [M/F]");
		
		String sexoMF = scan.next();
		
		switch (sexoMF) {
		
		case "m": 
		case "M": System.out.println("Masculino.");break;
		
		case "f": 	
		case "F": System.out.println("Feminino.");break;
		
		default:  System.out.println("Sexo inválido.");break;
		
		}
		
		

	}

}
