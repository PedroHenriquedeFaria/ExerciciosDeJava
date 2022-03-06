package Aula25;

import java.util.Scanner;

public class ContaCorrente {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String pergunta = "A";
		double dinheiro = 5;
		boolean continuar = true;
		int escolher = 0;
		
		Conta ContaCorrente = new Conta();
		
		ContaCorrente.numero = 1234555;
		ContaCorrente.saldo = -10;
		ContaCorrente.status = true;
		ContaCorrente.limite = 500;
		ContaCorrente.limiteInicial = 100;
		ContaCorrente.agencia = 54321;
		ContaCorrente.saque = true;
	
		System.out.println("========================");
		System.out.println("=  Banco   Catapimbas  =");
		System.out.println("========================");
		
		System.out.println("Número da conta: "+ContaCorrente.numero);
		System.out.println("Agência: "+ContaCorrente.agencia);
		System.out.println("Saldo: R$ "+ContaCorrente.saldo);
		System.out.println("\nSua conta possui cheque especial? ");
		pergunta = scan.next();
		
		switch(pergunta) {
		case "s":
		case "Sim":
		case "S": ContaCorrente.status = true;break;
		default: ContaCorrente.status = false;
				
		}
		ContaCorrente.verificador();
		
		do {
			System.out.println("\n|Para sacar dinheiro, digite 1.    |");
			System.out.println("|Para depositar dinheiro, digite 2.|");
			System.out.println("|Para consultar o saldo, digite 3. |");
			System.out.println("|Para fechar o programa, digite 0. |");
			escolher = scan.nextInt();
			
			switch(escolher) {
			case 1:
				do {

				System.out.println("Digite o valor que deseja retirar: ");
				dinheiro = scan.nextDouble(); 
				ContaCorrente.sacar(dinheiro);
				
				}while(ContaCorrente.saque == false);break;
				
			case 2:
				
				System.out.println("Digite o valor que deseja adicionar: ");
				dinheiro = scan.nextDouble(); 
				ContaCorrente.depositarDinheiro(dinheiro);break;
				
			case 3: System.out.println("Saldo: "+ContaCorrente.saldo);break;

			case 0: continuar = false;break;
	
			default: System.out.println("Digite um valor válido.");
			
			}
			
		}while(continuar == true);
		
	
	}

}

