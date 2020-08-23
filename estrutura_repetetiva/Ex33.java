package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, soma = 0;
		String res = "";
		System.out.print("Informe o número de termos: ");
		n = sc.nextInt();

		soma = informarTermos(n);
		System.out.println("Soma dos termos: " + soma);
	}

	private static int informarTermos(int n) {

		String res = "";
		/// S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
		int num = 1, den = 1, soma = 0, somaNum = 0, somaDen = 0;
		System.out.print("S = ");
		for (int i = 1; i <= n; i++) {
			System.out.printf(" %d/%d", num, den);
			if (i == n) {
				System.out.print(".");
			} else {
				System.out.print(" +");
			}
			num++;
			den += 2;
			somaNum += num;
			somaDen += den;
			soma = somaNum + somaDen;
		}
		System.out.println("\nSoma numerador: " + somaNum);
		System.out.println("Soma denominador: " + somaDen);
		return soma;
	}
}
