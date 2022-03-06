package Aula24;

public class ContatoCelular {
	
	public static void main(String[] args) {

	Contato Pedro = new Contato();
	
	Pedro.numero = new int[2];
	
	Pedro.nome = "Pedro";
	Pedro.numero[0] = 40028922;
	Pedro.numero[1] = 83546151;
	Pedro.operadora = "Claro";
	Pedro.regiao = "Minas Gerais";
	Pedro.email = "pedrohenriqfaria1@gmail.com";
	Pedro.zapzap = true;
	
	
	System.out.println("Nome do Contato: "+Pedro.nome);
	System.out.println("Telefone 1: "+Pedro.numero[0]);
	System.out.println("Telefone 2: "+Pedro.numero[1]);
	System.out.println("Operadora: "+Pedro.operadora);
	System.out.println("Região: "+Pedro.regiao);
	System.out.println("Email: "+Pedro.email);
	
	if(Pedro.zapzap == true) {
		
		System.out.println("Número vinculado ao Waths Up.");
		
	}
	
	
	}
}
