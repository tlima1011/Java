package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex22 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int n = 0;
		double media = 0;

		System.out.print("Informe a quantide de CDs: ");
		n = sc.nextInt();

		media = calcularMediaCd(n);
		System.out.printf("Média preco R$%.2f", media);

	}

	private static double calcularMediaCd(int n) {

		double preco = 0, soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Preço do %d CD em R$", (i + 1));
			preco = sc.nextDouble();
			soma += preco;
		}
		return soma / n;
	}
}
