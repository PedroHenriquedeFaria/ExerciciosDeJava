import java.util.Scanner;

public class SalArio {
	//eu sei que esta escrito errado '-'
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora? ");
		float ganhoHora = scan.nextFloat();
		System.out.println("Quantas horas voc� trabalhou esse m�s? ");
		float horaTrabalhadas = scan.nextFloat();
		double salario = ganhoHora * horaTrabalhadas;
		System.out.println("O seu sal�rio esse m�s ser� equivalente a: "+salario);
		
		
		
	}

}
