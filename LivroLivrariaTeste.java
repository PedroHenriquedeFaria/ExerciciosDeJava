package Aula24;

public class LivroLivrariaTeste {
	
public static void main(String[] args) {
		
		LivroDeLivraria HarryPoter = new LivroDeLivraria();
		HarryPoter.autor = "J.K. Rowling";
		HarryPoter.nome = "Harry Poter e a Pedra Flosofal.";
		HarryPoter.numeroPaginas = 255;
		HarryPoter.tipoCapa = "Dura.";
		HarryPoter.preco = 25.90;
		HarryPoter.quantidadeEstoque = 2;
		
		System.out.println("Nome do livro: "+HarryPoter.nome);
		System.out.println("Autor: "+HarryPoter.autor);
		System.out.println("Nuero de páginas: "+HarryPoter.numeroPaginas);
		System.out.println("Preço: R$ "+HarryPoter.preco);
		System.out.println("Tipo de capa: "+HarryPoter.tipoCapa);
		System.out.println("Quantidade em estoque: "+HarryPoter.quantidadeEstoque);
		
	}

}
