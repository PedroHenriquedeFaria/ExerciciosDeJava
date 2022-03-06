import java.util.Scanner;

public class LastExercco {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o tamanho do arquivo?(MB)");
		float arquivo = scan.nextFloat();
		System.out.println("Qual a velocidade da internet?(MBps)");
		float tempo = scan.nextFloat();
		double demora = arquivo/tempo;
		System.out.println("Seu dowload levará aproximadamente "+demora+" minutos para ser concluído.");
		
		
		
				
	}

}
