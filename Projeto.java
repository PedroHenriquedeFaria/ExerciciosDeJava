import java.util.Scanner;

public class Projeto {
	public static void main (String [] args) {
		System.out.println("Alo, Mundo!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();
		System.out.println("Digite outro n�mero: ");
		int numero2 = scan.nextInt();
		int soma = numero + numero2;
		
		System.out.println("A soma dos n�mero digitados � igual a: "+soma);
	}
}
