package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tamanho = 0, link = 0, tempo = 0; 
		
		System.out.print("Tamanho do arquivo MB: ");
		tamanho = sc.nextDouble();
		
		System.out.print("Velocidade de Internet: ");
		link = sc.nextDouble();
		
		tempo = calcularTempo(tamanho, link); 
		System.out.printf("Tempo de download %.1f segundos", tempo);
		
	}

	private static double calcularTempo(double tamanho, double link) {
		return tamanho / link;
	}

}
