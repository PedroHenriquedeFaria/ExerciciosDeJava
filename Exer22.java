package ExerciciosIfElse;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double precoMaca = 0;
		double precoMora = 0;
		double precoFinal;
		
		System.out.println("Quantos quilogramas de maças fora coprados? ");
		double macas = scan.nextDouble();
		
		System.out.println("Quantos quilogramas de morangos fora coprados? ");
		double morango = scan.nextDouble();
		
		if (macas <= 5) {
			precoMaca = 1.80;
			
			} else {
				precoMaca = 1.50;
				}
		
		if (morango <= 5) {
			precoMora = 2.50;
			
			} else {
				precoMora = 2.20;
				}
		
		double pesoMacaMora = morango+ macas;
		
		precoFinal = precoMaca * macas + precoMora * morango;
		
		
		if (pesoMacaMora > 8 || precoFinal > 25) {
			precoFinal = precoFinal - (precoFinal / 100*10);
		} 
			
		System.out.println("O valor a ser pago é de: R$ "+precoFinal);
		
		
	}

}
