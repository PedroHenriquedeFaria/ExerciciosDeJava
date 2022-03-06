import java.util.Scanner;

public class ConversorFareiheigtParaCelsiusPortioles {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o grau em Farenheit: ");
		float fareinheit = scan.nextFloat();
		double celsius = (5*(fareinheit-32))/9;
		System.out.println("O equivalenete de "+fareinheit+" em graus Celsius é "+celsius);
		
		
		
	}

}
