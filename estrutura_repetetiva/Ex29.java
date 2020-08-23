package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String res = "";
		int n;

		System.out.print("Informe o número de termos: ");
		n = sc.nextInt();

		res = informarNumerosPrimos(n);
		System.out.println(res);

	}

	private static String informarNumerosPrimos(int num) {

		String res = "";
		int cont = 0, n = 1, j = 0;
		System.out.println("Números primos");
		for (j = 1; j < num; j++) {
			cont = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					cont++;
				}
			}
			if (cont == 2) {
				System.out.printf("%d ", j);
			}
		}
		return res;
	}

}
