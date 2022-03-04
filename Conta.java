package Aula25;

public class Conta {
	
	int numero;
	double saldo;
	double saldoInicial;
	boolean status;
	double limite;
	double limiteInicial;
	int agencia;
	boolean saque;
	
	double sacar(double dinheiro) {
	if(dinheiro>saldo && status == true) {
		
		saldoInicial = saldo;
		limiteInicial = limite;
		saldo += - dinheiro;
		limite += saldo;
		
		if(limite<0){
			saque = false;
			System.out.println("Limite atingido.");
			limite = limiteInicial;
			saldo = saldoInicial;
			return limite;
		}else {
		saldo = 0;
		System.out.println("Fatura do cheque especial: "+limite);
		saque = true;
		}
		
		return saldo;
		
	}else if(dinheiro > saldo && status == false) {
		System.out.println("Saldo insuficiente.");
		
		saque = false;
		return saldo;
	}else {
		 saque = true;
		 saldo = saldo - dinheiro;
			return saldo;
		}

	}
	
	double depositarDinheiro(double dinheiro) {
		if(limite < limiteInicial) {
			dinheiro -=  limiteInicial - limite;
			limite = limiteInicial;	
		}
		
		saldo = saldo + dinheiro;
		return saldo;
	}
	
	void verificador() {
		if(status == true) {
			System.out.println("Status da conta: Conta Especial.");
			System.out.println("Limite: R$ "+limite);

			}else {
				System.out.println("Status da conta: Conta Normal.");
				}
		
	}
	
	
	
}
