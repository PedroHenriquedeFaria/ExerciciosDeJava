import java.util.Scanner;

public class SalArio {
	//eu sei que esta escrito errado '-'
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora? ");
		float ganhoHora = scan.nextFloat();
		System.out.println("Quantas horas você trabalhou esse mês? ");
		float horaTrabalhadas = scan.nextFloat();
		double salario = ganhoHora * horaTrabalhadas;
		System.out.println("O seu salário esse mês será equivalente a: "+salario);
		
		
		
	}

}
