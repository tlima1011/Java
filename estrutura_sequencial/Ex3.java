package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n1 = 0, n2 = 0, soma = 0;

		System.out.print("Informe o primeiro numero: ");
		n1 = sc.nextInt();

		System.out.print("Informe o segundo numero: ");
		n2 = sc.nextInt();

		System.out.println("A soma = " + somar(n1, n2));

	}

	private static int somar(int n1, int n2) {
		return n1 + n2;
	}
}
