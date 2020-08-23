package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = 0, fatorial = 0;
		String resultado = "";

		System.out.print("Informe um número: ");
		numero = sc.nextInt();

		resultado = calcularPrimo(numero);
		System.out.println(resultado);
	}

	private static String calcularPrimo(int numero) {

		String res = "";
		int cont = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				cont++;
			}

			if (cont == 2) {
				res = "É primo";
			} else {
				res = "Não É primo";
			}
		}
		return res;
	}
}
