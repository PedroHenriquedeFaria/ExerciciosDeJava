import java.util.Scanner;

public class DobroDaAreaDeUmQuadrado {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base do quadrado: ");
		float base = scan.nextFloat();
		double dobroArea = (base * base)*2;
		System.out.println("O dobro da �rea desse quadrado � igual a : "+dobroArea);
		
		
	}

}
