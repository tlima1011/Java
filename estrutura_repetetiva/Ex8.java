package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int maior = 0, numero = 0, menor = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe o %dº número: ", (i + 1));
			numero = sc.nextInt();
			if (i == 0) {
				maior = numero;
				menor = numero;
			} else {
				if (numero > maior) {
					maior = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
	}
}
