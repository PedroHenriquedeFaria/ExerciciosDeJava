package Aula25;

public class Lampada {
	String modelo;
	String brilho;
	String tensao;
	String cor;
	String tipo;
	int garantia;
	double potencia;
	double preco;
	boolean ligar;
	
	void ligarLampada(){
		ligar = true;
		System.out.println("L�mpada ligada.");
	}
	
	void desligarLampada(){
		ligar = false;
		System.out.println("L�mpada desligada.");
	}

}
