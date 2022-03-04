import java.util.Scanner;

public class PesoIdeal {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite sua altura: ");
		float altura = scan.nextFloat();
		double peso = (72.7 * altura) - 58;
		System.out.println("O seu peso ideia é igual a: "+peso);
		
		
	}
}
