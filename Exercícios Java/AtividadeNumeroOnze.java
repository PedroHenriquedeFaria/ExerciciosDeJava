import java.util.Scanner;

public class AtividadeNumeroOnze {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números inteiros e um número real: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		Float number3 = scan.nextFloat();
		double a = (number2/2)*(number1*2);
		System.out.println("O produto do dobro do primeiro com a metade do segundo número é igual a :"+a);
		double b = (number1*3)+(number3);
		System.out.println("A soma do triplo do primeiro com o terceiro número é equivalente a: "+b);
		double c = Math.pow(number3, 3);
		System.out.println("O cubo do terceiro número é: "+c);
		
	}
	

}
