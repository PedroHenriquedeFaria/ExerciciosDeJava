import java.util.Scanner;

public class ExercicioTrezeBirl {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora? ");
		float ganhoHora = scan.nextFloat();
		System.out.println("Quantas horas você trabalhou esse mês? ");
		float horaTrabalhadas = scan.nextFloat();
		double salario = ganhoHora * horaTrabalhadas;
		double impRend = salario/100 * 11;
		double inss = salario/100 * 8;
		double sindicato = salario/100 * 5;
		double salarioL = salario-(inss+impRend+sindicato);
		double desc = (inss+impRend+sindicato);
		
		
		System.out.println("O seu salário bruto esse mês será equivalente a: "+salario);
		System.out.println("Foi pago ao Imposto de Renda: "+impRend);
		System.out.println("Foi pago ao INSS: "+inss);
		System.out.println("Foi pago ao sindicato: "+sindicato);
		System.out.println("Total descontos: "+desc);
		System.out.println("O seu salário liquido esse mês será equivalente a: "+salarioL);
		
	}
	

}
