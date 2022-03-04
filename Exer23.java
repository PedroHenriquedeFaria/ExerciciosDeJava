package ExerciciosIfElse;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double preco = 0;
		double precoFinal=0;
		int pagamentoCartao = 0;
		String produto= "Carne";
		String tipoPagamento= "Pagamento normal.";
		double desconto = 0;
		
		System.out.println("==============================================================");
		System.out.println("==================| HIPERMERCADO  TABAJARA |==================");
		System.out.println("==============================================================");
		System.out.println("");
		System.out.println("---------------| Até  5Kg |----| Acima de 5Kg |---------------");
		System.out.println("---------------|----------|----|--------------|---------------");
		System.out.println("-FiléDuplo-    |R$ 4,90 Kg|----| R$ 5,80  Kg  |---------------");
		System.out.println("-Alcatra-      |R$ 5,90 Kg|----| R$ 6,80  Kg  |---------------");
		System.out.println("-Picanha-      |R$ 6,90 Kg|----| R$ 7,80  Kg  |---------------");
		System.out.println("==============================================================");
		System.out.println("==============================================================");
		System.out.println("");
		
		
		
		
		System.out.println("Qual tipo de carne você deseja comprar? [F/A/P]");
		String carne = scan.next();
		
		System.out.println("Quantos Kg de carne  deseja comprar? ");
		double kg = scan.nextDouble();
		
		System.out.println("O pagamento será feito no cartão Tabajara? ");
		String cartao = scan.next();
		
		switch(cartao){
		case "S":
		case "Sim":
		case "sim":
		case "s":
		case "Yes":
		case "Si":
			pagamentoCartao = 1;
			tipoPagamento= "Cartão Tabajara.";
		}
		
		
		switch(carne){
		
		case "F":
		case "f":
				if (kg <= 5) {
					preco = 4.90*kg;
				
					} else {
						preco = 5.80*kg;
						}
				produto = "Filé Duplo.";break;
						
			
		case "A":
		case "a":
			if (kg <= 5) {
				preco = 5.90*kg;
			
				} else {
					preco = 6.80*kg;
					}
			produto = "Alcatra.";break;
			
		case "P":
		case "p":
			if (kg <= 5) {
				preco = 6.90*kg;
			
				} else {
					preco = 7.80*kg;
					}
			produto = "Picanha.";break;
			
		default: 
			System.out.println("===================================================");
			System.out.println("========| Tipo  de carne não identificado |========");
			System.out.println("===================================================");
		}
		
		if(pagamentoCartao == 1) {
			desconto = preco/100*5;
			precoFinal = preco - desconto;
		}else {
			precoFinal = preco;
		}
		
		System.out.println("===================================================");
		System.out.println("==================| NOTA FISCAL |==================");
		System.out.println("===================================================");
		System.out.println("");
		
		System.out.println("|PRODUTO: "+produto);
		System.out.println("|QUANTIDADE: "+kg);
		System.out.println("|PREÇO TOTAL: R$ "+preco);
		System.out.println("|TIPO PAGAMENTO: "+tipoPagamento);
		System.out.println("|DESCONTO: R$ "+desconto);
		System.out.println("|PREÇO A PAGAR: R$ "+precoFinal);
		
	}

}