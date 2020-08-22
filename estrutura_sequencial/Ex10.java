package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double f = 0, c = 0;
		System.out.print("Valor em Celsius: ");
		c = sc.nextDouble();

		f = converterParaF(c);
		System.out.printf("Valor em fahrenheit %.1fº", f);
	}
	private static double converterParaF(double c) {
		return c * (9 / 5.0) + 32;
	}
}
