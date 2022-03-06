import java.util.Scanner;

public class Questoes {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1 = scan.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = scan.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float nota3 = scan.nextFloat();
		System.out.println("Digite a quarta nota: ");
		float nota4 = scan.nextFloat();
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média das suas notas é equivalente a: "+media);
	} 
		
	
}
