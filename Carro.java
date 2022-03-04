package Aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
		void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é de "+capCombustivel * consumoCombustivel +" Km.");
		
	}
		
		double obterAutonomia() {
			System.out.println("Método obterAutonomia foi chamado");
			
			return capCombustivel * consumoCombustivel;
			
		}
		
		double calcularCombustivel(double Km) {
			
			double qtdCombustivel = Km / consumoCombustivel;
			
			return qtdCombustivel;
			
		}
		
		

}
