package Aula24;

import java.util.Date;

public class LivroDeBibliotecaTeste {
	
	public static void main(String[] args) {
		
		LivroDeBiblioteca vinteMilLeguas = new LivroDeBiblioteca();
		Date data = new Date();
		
		vinteMilLeguas.nome = "Vinte mil léguas submarinas.";
		vinteMilLeguas.autor = "Júlio Verne.";
		vinteMilLeguas.numeroPaginas = 223;
		vinteMilLeguas.tipoCapa = "Capa mole.";
		vinteMilLeguas.conservacao = "Médio.";
		vinteMilLeguas.tempo = 2;
		vinteMilLeguas.anoPublicacao = 1869;
		vinteMilLeguas.data = data;
		vinteMilLeguas.emprestado = "Pedrin";
		
		System.out.println("Nome do livro: "+vinteMilLeguas.nome);
		System.out.println("Autor: "+vinteMilLeguas.autor);
		System.out.println("Número de páginas: "+vinteMilLeguas.numeroPaginas);
		System.out.println("Tipo de capa: "+vinteMilLeguas.tipoCapa);
		System.out.println("Estado de conservação: "+vinteMilLeguas.conservacao);
		System.out.println("Foi emprestado para: "+vinteMilLeguas.emprestado);
		System.out.println("Data do empréstimo: "+vinteMilLeguas.data);
		System.out.println("Tempo até devolução: "+vinteMilLeguas.tempo+" meses.");


	}

}
