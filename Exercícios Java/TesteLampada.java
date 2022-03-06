package Aula25;

import java.util.Scanner;

public class TesteLampada {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int tipo = 0;
			boolean repetir = false;
			int ligaDesliga = 0;
			
			Lampada Fluorescente = new Lampada();
			
			Fluorescente.modelo = "A60.";
			Fluorescente.brilho = "Amarelo.";
			Fluorescente.tensao = "Bivolt.";
			Fluorescente.potencia = 7;
			Fluorescente.preco = 50.60;
			Fluorescente.cor = "Amarela";
			Fluorescente.garantia = 36;
			Fluorescente.ligar = false;

			
			
			do{
			repetir = false;
			System.out.println("====================================");
			System.out.println("          TIPOS DE LÂMPADA");
			System.out.println("====================================");
			System.out.println("ABAJUR 	   ->   1");
			System.out.println("LAMPEÕES   ->   2");
			System.out.println("LUMINÁRIAS ->   3");
			System.out.println("PENDENTES  ->   4");
			
			System.out.println("\nSelecione um tipo de lâmpada: ");
			tipo = scan.nextInt();
			
			switch(tipo) {
			case 1: Fluorescente.tipo = "Abajur.";break;
			case 2: Fluorescente.tipo = "Lampeão.";break;
			case 3: Fluorescente.tipo = "Luminária.";break;
			case 4: Fluorescente.tipo = "Pendente.";break;
			default:
				System.out.println("Selecione um tipo válido!\n");
				repetir = true;
			
			}
			
			}while(repetir == true);
			
			
			System.out.println("Modelo: "+Fluorescente.modelo);
			System.out.println("Brilho: "+Fluorescente.brilho);
			System.out.println("Tensao: "+Fluorescente.tensao);
			System.out.println("Potência: "+Fluorescente.potencia+" W.");
			System.out.println("Preço: "+Fluorescente.preco+".");
			System.out.println("Cor: "+Fluorescente.cor+".");
			System.out.println("Garantia: "+Fluorescente.garantia+" meses.");
			System.out.println("Tipo de lâmpada: "+Fluorescente.tipo);
			do {
				
				
			repetir = false;
			
			System.out.println("\nTESTE DA LÂMPADA: 1 ONN/ 2 OFF");
			ligaDesliga = scan.nextInt();
			
			if(ligaDesliga == 1) {	
				Fluorescente.ligarLampada();
			
			}else if(ligaDesliga == 2) {
				Fluorescente.desligarLampada();
			}else {
				System.out.println("Valor inválido!");
				repetir = true;
			}
			
			}while(repetir == true);
		
		
		}

	}

