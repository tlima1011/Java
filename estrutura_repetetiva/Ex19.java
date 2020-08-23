package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		double media = 0;
		
		System.out.print("Informe o número de notas: ");
		n = sc.nextInt(); 
		
		media = calcularMedia(n);
		System.out.printf("Media = %.1f", media);

	}

	private static double calcularMedia(int n) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota = 0, soma = 0; 
		
		for(int i = 0; i < n;i++) {
			System.out.printf("Informe a %dª nota: ", (i + 1));
			nota = sc.nextDouble();
			soma += nota; 
		}
		return soma / n;
	}

}
