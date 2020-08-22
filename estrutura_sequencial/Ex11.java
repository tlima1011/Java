package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1 = 0, n2 = 0;
		double n3 = 0;

		System.out.print("Informe o primeiro numero: ");
		n1 = sc.nextInt();

		System.out.print("Informe o segundo numero: ");
		n2 = sc.nextInt();

		System.out.print("Informe o terceiro numero: ");
		n3 = sc.nextDouble();

		String resultado = informarResultado(n1, n2, n3);
		System.out.println(resultado);
	}

	private static String informarResultado(int n1, int n2, double n3) {
		double res1 = n1 * 2 * (n3 / 2.0);
		double res2 = n2 * 3 + n3;
		double res3 = Math.pow(n3, 3);
		return "Resultado 1: " + res1 + "\nResultado 2: " + res2 + "\nResultado 3: " + res3;
	}
}
