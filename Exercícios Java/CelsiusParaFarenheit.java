import java.util.Scanner;

public class CelsiusParaFarenheit {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o grau em C°: ");
		float celsius = scan.nextFloat();
		double faren = (celsius*9/5)+32;
		System.out.println("A conversão é igual a "+ faren +" graus farenheit.");
		
	}
}

