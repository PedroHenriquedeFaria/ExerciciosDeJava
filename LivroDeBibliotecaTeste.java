package Aula24;

import java.util.Date;

public class LivroDeBibliotecaTeste {
	
	public static void main(String[] args) {
		
		LivroDeBiblioteca vinteMilLeguas = new LivroDeBiblioteca();
		Date data = new Date();
		
		vinteMilLeguas.nome = "Vinte mil l�guas submarinas.";
		vinteMilLeguas.autor = "J�lio Verne.";
		vinteMilLeguas.numeroPaginas = 223;
		vinteMilLeguas.tipoCapa = "Capa mole.";
		vinteMilLeguas.conservacao = "M�dio.";
		vinteMilLeguas.tempo = 2;
		vinteMilLeguas.anoPublicacao = 1869;
		vinteMilLeguas.data = data;
		vinteMilLeguas.emprestado = "Pedrin";
		
		System.out.println("Nome do livro: "+vinteMilLeguas.nome);
		System.out.println("Autor: "+vinteMilLeguas.autor);
		System.out.println("N�mero de p�ginas: "+vinteMilLeguas.numeroPaginas);
		System.out.println("Tipo de capa: "+vinteMilLeguas.tipoCapa);
		System.out.println("Estado de conserva��o: "+vinteMilLeguas.conservacao);
		System.out.println("Foi emprestado para: "+vinteMilLeguas.emprestado);
		System.out.println("Data do empr�stimo: "+vinteMilLeguas.data);
		System.out.println("Tempo at� devolu��o: "+vinteMilLeguas.tempo+" meses.");


	}

}
