import java.util.Scanner;

public class MetroParaCentimetro {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva a quantidade de metros que deseja converter para cet�metros: ");
		float metro = scan.nextFloat();
		float cm = (metro*100);
		System.out.println("A convers�o para metros � igual a : "+cm);
		
		
		
	
	}

}
