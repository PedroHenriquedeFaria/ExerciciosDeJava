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
		System.out.println("Lâmpada ligada.");
	}
	
	void desligarLampada(){
		ligar = false;
		System.out.println("Lâmpada desligada.");
	}

}
