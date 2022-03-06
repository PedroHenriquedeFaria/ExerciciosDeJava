import java.util.Scanner;

public class AreaCirculo {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Qual é o raio do círculo? ");
		float raio = scan.nextFloat();
		double area = Math.pow(raio, 2) * Math.PI;
		
		
		System.out.println("A área do círculo é: "+ area); 
		
	}
}
