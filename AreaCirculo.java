import java.util.Scanner;

public class AreaCirculo {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Qual � o raio do c�rculo? ");
		float raio = scan.nextFloat();
		double area = Math.pow(raio, 2) * Math.PI;
		
		
		System.out.println("A �rea do c�rculo �: "+ area); 
		
	}
}
