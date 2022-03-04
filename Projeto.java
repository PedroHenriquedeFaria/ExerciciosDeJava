import java.util.Scanner;

public class Projeto {
	public static void main (String [] args) {
		System.out.println("Alo, Mundo!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		System.out.println("Digite outro número: ");
		int numero2 = scan.nextInt();
		int soma = numero + numero2;
		
		System.out.println("A soma dos número digitados é igual a: "+soma);
	}
}
