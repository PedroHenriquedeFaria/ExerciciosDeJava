package ExerciciosIfElse;

import java.util.Scanner;

public class Exer20 {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==============================");
		System.out.println("=|=     INTERROGATÓRIO     =|=");
		System.out.println("==============================");
		System.out.println("");

		
		int respPositiv = 0;
		
		System.out.println("Telefonou para a vítima? [S/N] ");
		String resp1 = scan.next();
			
		switch(resp1){
	    
	    case "S":
	    case "s":
			
			respPositiv++;
			
		}
		
		System.out.println("Esteve no local do crime? [S/N] ");
		String resp2 = scan.next();
		
		switch(resp2){
	    
	    case "S":
	    case "s":
			
			respPositiv++;
			
		}
		
		System.out.println("Mora perto da vítima? [S/N] ");
		String resp3 = scan.next();
		
		switch(resp3){
	    
	    case "S":
	    case "s":
			
			respPositiv++;
			
		}
		
		System.out.println("Devia para a vítima? [S/N] ");
		String resp4 = scan.next();
		
	    switch(resp4){
	    
	    case "S":
	    case "s":
			
			respPositiv++;
			
		}
		
		System.out.println("Já trabalhou para a vítima? [S/N] ");
		String resp5 = scan.next();
		
		switch(resp5){
	    
	    case "S":
	    case "s":
			
			respPositiv++;
			
		}
		
		if (respPositiv == 2) {
			
			System.out.println("Suspeito");
			
			}else if (respPositiv == 3 || respPositiv ==4) {
			
			System.out.println("Cumplice");
			
				}else if (respPositiv == 5) {
					
					System.out.println("Assassino");
					
					}else {	
							System.out.println("Inocente");
						}
		
	}

}
