package Aula25;

import java.util.Scanner;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno Pedrin = new Aluno();
		Pedrin.media = 0;
		
		System.out.println("Digite o nome do Aluno: ");
		Pedrin.nome = scan.next();
		System.out.println("Digite seu número de matrícula: ");
		Pedrin.matricula = scan.nextInt();
		System.out.println("Digite o curso que "+Pedrin.nome +" está matriculad@: ");
		Pedrin.curso = scan.next();
		
		Pedrin.diciplinas = new String[3];	
		Pedrin.notas = new double[3][3];	
		
		for(int i = 0; i< Pedrin.diciplinas.length; i++) {
			System.out.println("Digite o nome da "+(i+1) +"° disciplina: ");
			Pedrin.diciplinas[i] = scan.next();
			
				for(int j = 0; j< Pedrin.notas.length; j++) {
			
			System.out.println("Digite a "+(j+1)+"° nota da disciplina: ");
			Pedrin.notas[i][j] = scan.nextDouble();	
				}
		}
		
		System.out.println("\nFICHA DO ALUNO: ");
		System.out.println("Nome: "+Pedrin.nome);
		System.out.println("Matrícula: "+Pedrin.matricula);
		System.out.println("Curso: "+Pedrin.curso);
		
		for(int i = 0; i< Pedrin.diciplinas.length; i++) {
			Pedrin.media = 0;
			System.out.println("Disciplina "+(i+1)+": "+Pedrin.diciplinas[i] );
				System.out.println("Notas: ");
				for(int j = 0; j< Pedrin.notas.length; j++) {
					
					System.out.print(Pedrin.notas[i][j]+" ");
					Pedrin.media += Pedrin.notas[i][j];
				}
				
				Pedrin.aprovar(Pedrin.media);
		}
	
	}

}
