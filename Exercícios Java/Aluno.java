package Aula25;

public class Aluno {
	
	String nome;
	int matricula;
	String curso;
	String[] diciplinas;
	double[][] notas;
	double media;
	
	
	void aprovar(double media) {
	
				if(media/3 >= 7 ) {
					System.out.println("\nSitua��o: Aprovado");
				}else {
					System.out.println("\nSitua��o: Reprovado");
				}
				
		}


}
