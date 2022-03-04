package Aula25;

import java.util.Scanner;

public class JuegoDaVelia {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] tabuleiro = new String[3][3];
		int[][] ocupado = new int[3][3];
		tabuleiro[0][0] = "[1]";
		tabuleiro[0][1] = "[2]";
		tabuleiro[0][2] = "[3]";
		tabuleiro[1][0] = "[4]";
		tabuleiro[1][1] = "[5]";
		tabuleiro[1][2] = "[6]";
		tabuleiro[2][0] = "[7]";
		tabuleiro[2][1] = "[8]";
		tabuleiro[2][2] = "[9]";
		int escolha = 0;
		int vitoriaLinha0X = 0;
		int vitoriaLinha1X = 0;
		int vitoriaLinha2X = 0;
		int vitoriaColuna0X = 0;
		int vitoriaColuna1X = 0;
		int vitoriaColuna2X = 0;
		int vitoriaDiagonalX012 = 0;
		int vitoriaDiagonalX210 = 0;
		int vitoriaLinha0O = 0;
		int vitoriaLinha1O = 0;
		int vitoriaLinha2O = 0;
		int vitoriaColuna0O = 0;
		int vitoriaColuna1O = 0;
		int vitoriaColuna2O = 0;
		int vitoriaDiagonalO012 = 0;
		int vitoriaDiagonalO210 = 0;
		int veia = 0;
		
		
		
		boolean vitoria = false;
		boolean repetir = false;
		
		
		for(int i = 0; i<ocupado.length; i++) {
			for(int j = 0; j<ocupado[i].length;j++) {
				
				ocupado[i][j] = 1;

			}
		
		}
		
		
		do {
		for(int i = 0; i<tabuleiro.length; i++) {
			for(int j = 0; j<tabuleiro[i].length;j++) {
				System.out.print(tabuleiro[i][j]);
					}
						System.out.println(" ");		
				}
		do{
			repetir = false;
			System.out.println("\nOnde deseja colocar o \"X\"?");
			escolha = scan.nextInt();
			switch(escolha) {
			case 1: 
				if(ocupado[0][0] == 1) {
					tabuleiro[0][0] = "[X]";
					ocupado[0][0] = 0;
					vitoriaLinha0X += 1;
					vitoriaColuna0X +=1;
					vitoriaDiagonalX012 +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;

			case 2: 
				if(ocupado[0][1] == 1) {
					tabuleiro[0][1] = "[X]";
					ocupado[0][1] = 0;
					vitoriaLinha0X += 1;
					vitoriaColuna1X +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;

			case 3: 
				if(ocupado[0][2] == 1) {
					tabuleiro[0][2] = "[X]";
					ocupado[0][2] = 0;
					vitoriaLinha0X += 1;
					vitoriaColuna2X +=1;
					vitoriaDiagonalX210+=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 4: 
				if(ocupado[1][0] == 1) {
					tabuleiro[1][0] = "[X]";
					ocupado[1][0] = 0;
					vitoriaLinha1X += 1;
					vitoriaColuna0X +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 5:
				if(ocupado[1][1] == 1) {
					tabuleiro[1][1] = "[X]";
					ocupado[1][1] = 0;
					vitoriaLinha1X += 1;
					vitoriaColuna1X +=1;
					vitoriaDiagonalX012 +=1;
					vitoriaDiagonalX210+=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 6: 
				if(ocupado[1][2] == 1) {
					tabuleiro[1][2] = "[X]";
					ocupado[1][2] = 0;
					vitoriaLinha1X += 1;
					vitoriaColuna2X +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 7:
				if(ocupado[2][0] == 1) {
					tabuleiro[2][0] = "[X]";
					ocupado[2][0] = 0;
					vitoriaLinha2X += 1;
					vitoriaColuna0X +=1;
					vitoriaDiagonalX210+=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 8: 
				if(ocupado[2][1] == 1) {
					tabuleiro[2][1] = "[X]";
					ocupado[2][1] = 0;
					vitoriaLinha2X += 1;
					vitoriaColuna1X +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 9: 
				if(ocupado[2][2] == 1) {
					tabuleiro[2][2] = "[X]";
					ocupado[2][2] = 0;
					vitoriaLinha2X += 1;
					vitoriaColuna2X +=1;
					vitoriaDiagonalX012 +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			default: System.out.println("Digite um valor válido!");
			repetir = true;
			}
		}while(repetir == true);
		
		for(int i = 0; i<tabuleiro.length; i++) {
			for(int j = 0; j<tabuleiro[i].length;j++) {
				
				System.out.print(tabuleiro[i][j]);

			}
			System.out.println(" ");		
		}
		if(vitoriaLinha0X == 3 || vitoriaLinha1X == 3 || vitoriaLinha2X == 3 ||  vitoriaColuna0X == 3||  vitoriaColuna1X == 3|| vitoriaColuna2X == 3|| vitoriaDiagonalX012 == 3|| vitoriaDiagonalX210 == 3) {
			vitoria = true;
			System.out.println("Vitória do jogador \"X\"!");
			break;
		}
		if(veia == 9) {
			vitoria = true;
			System.out.println("Deu velha!");
			break;
		}

		//Jogador "O"
		
		do{
			repetir = false;
			System.out.println("\nOnde deseja colocar o \"O\"?");
			escolha = scan.nextInt();
			switch(escolha) {
			case 1: 
				if(ocupado[0][0] == 1) {
					tabuleiro[0][0] = "[O]";
					ocupado[0][0] = 0;
					vitoriaLinha0O += 1;
					vitoriaColuna0O +=1;
					vitoriaDiagonalO012 +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;

			case 2: 
				if(ocupado[0][1] == 1) {
					tabuleiro[0][1] = "[O]";
					ocupado[0][1] = 0;
					vitoriaLinha0O += 1;
					vitoriaColuna1O +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;

			case 3: 
				if(ocupado[0][2] == 1) {
					tabuleiro[0][2] = "[O]";
					ocupado[0][2] = 0;
					vitoriaLinha0O += 1;
					vitoriaColuna2O +=1;
					vitoriaDiagonalO210+=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 4: 
				if(ocupado[1][0] == 1) {
					tabuleiro[1][0] = "[O]";
					ocupado[1][0] = 0;
					vitoriaLinha1O += 1;
					vitoriaColuna0O +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 5:
				if(ocupado[1][1] == 1) {
					tabuleiro[1][1] = "[O]";
					ocupado[1][1] = 0;
					vitoriaLinha1O += 1;
					vitoriaColuna1O +=1;
					vitoriaDiagonalO012 +=1;
					vitoriaDiagonalO210+=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 6: 
				if(ocupado[1][2] == 1) {
					tabuleiro[1][2] = "[O]";
					ocupado[1][2] = 0;
					vitoriaLinha1O += 1;
					vitoriaColuna2O +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 7:
				if(ocupado[2][0] == 1) {
					tabuleiro[2][0] = "[O]";
					ocupado[2][0] = 0;
					vitoriaLinha2O += 1;
					vitoriaColuna0O +=1;
					vitoriaDiagonalO210+=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 8: 
				if(ocupado[2][1] == 1) {
					tabuleiro[2][1] = "[O]";
					ocupado[2][1] = 0;
					vitoriaLinha2O += 1;
					vitoriaColuna1O +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			case 9: 
				if(ocupado[2][2] == 1) {
					tabuleiro[2][2] = "[O]";
					ocupado[2][2] = 0;
					vitoriaLinha2O += 1;
					vitoriaColuna2O +=1;
					vitoriaDiagonalO012 +=1;
					veia += 1;
				}else{
					repetir = true;
					System.out.println("Jogada inválida!");
				}break;
				
			default: System.out.println("Digite um valor válido!");
			repetir = true;
			}
			
		}while(repetir == true);
		
		if(vitoriaLinha0O == 3 || vitoriaLinha1O == 3 || vitoriaLinha2O == 3 ||  vitoriaColuna0O == 3||  vitoriaColuna1O == 3|| vitoriaColuna2O == 3|| vitoriaDiagonalO012 == 3|| vitoriaDiagonalO210 == 3) {
			vitoria = true;
			
			for(int i = 0; i<tabuleiro.length; i++) {
				for(int j = 0; j<tabuleiro[i].length;j++) {
					System.out.print(tabuleiro[i][j]);
						}
							System.out.println(" ");		
					}
			
			System.out.println("Vitória do jogador \"O\"!");
		}
		
		}while(vitoria == false);
	}

}
