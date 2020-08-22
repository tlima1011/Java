package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;

		System.out.print("Informe a nota 1: ");
		nota1 = sc.nextDouble(); 
		
		System.out.print("Informe a nota 2: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Informe a nota 3: ");
		nota3 = sc.nextDouble();
		
		System.out.print("Informe a nota 4: ");
		nota4 = sc.nextDouble();
				
		double media = calcularMedia(nota1, nota2);
		System.out.printf("A media = %.1f", media);
	}
	
	private static double calcularMedia(double n1, double n2) {
		double media = (n1 + n2) / 4.0; 
		return media;
		
	}
	

}
