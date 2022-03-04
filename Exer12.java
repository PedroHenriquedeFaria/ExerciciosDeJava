package ExerciciosIfElse;

import java.util.Scanner;

public class Exer12{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		float ganhoHora = scan.nextFloat();
		System.out.println("Quantas horas você trabalhou esse mês? ");
		float horaTrabalhadas = scan.nextFloat();
		double salario = ganhoHora * horaTrabalhadas;
		double impRend;
		if (salario <= 900) {
			impRend = 0;
			}else if(salario >900 && salario <=1500) {
				impRend = salario/100 *5;
				}else if(salario >1500 && salario <=2500) {
				impRend = salario/100 *10;
					}else {
						impRend = salario/100 *20;
						}
		
		double inss = salario/100 * 10;
		double FGTS = salario/100 * 11;
		double desc = (inss+impRend);
		double salarioL = salario - desc; 
		
		
		System.out.println("O seu salário bruto esse mês será equivalente a: R$ "+salario);
		System.out.println("Foi pago ao Imposto de Renda: R$ "+impRend);
		System.out.println("Foi pago ao INSS: R$ "+inss);
		System.out.println("Foi depostado no FGTS: R$ "+FGTS);
		System.out.println("Total descontos: R$ "+desc);
		System.out.println("O seu salário liquido esse mês será equivalente a: R$ "+salarioL);
		
	}
	

}
