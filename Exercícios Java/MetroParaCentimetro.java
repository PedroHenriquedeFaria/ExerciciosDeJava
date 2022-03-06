import java.util.Scanner;

public class MetroParaCentimetro {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva a quantidade de metros que deseja converter para cetímetros: ");
		float metro = scan.nextFloat();
		float cm = (metro*100);
		System.out.println("A conversão para metros é igual a : "+cm);
		
		
		
	
	}

}
