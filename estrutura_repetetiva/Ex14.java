package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int pares = 0, impares = 0, numeros = 0;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o %dº número: ", (i + 1));
			numeros = sc.nextInt();
			if (numeros % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Números Pares: " + pares);
		System.out.println("Números Impares: " + impares);
	}
}
