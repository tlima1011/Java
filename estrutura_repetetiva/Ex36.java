package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, soma = 0;
		String res = "";

		System.out.print("Informe o número de termos: ");
		n = sc.nextInt();

		soma = informarTermos(n);
		System.out.println("\nSoma dos termos: " + soma);
	}

	private static int informarTermos(int n) {

		String res = "";
		/// S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
		int num = 1, den = 1, soma = 0, somaNum = 0, somaDen = 0;
		System.out.printf("H = %d + ", num);
		for (int i = 1; i <= n; i++) {
			soma += num + den;
			System.out.printf(" %d/%d", num, den);
			if (i == n) {
				System.out.print(".");
			} else {
				System.out.print(" +");
			}
			den += 2;
		}
		return soma;
	}
}
