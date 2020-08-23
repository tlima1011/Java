package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int base = 0, expoente = 0, potencia;
		System.out.print("Informe a base: ");
		base = sc.nextInt();

		System.out.print("Informe expoente: ");
		expoente = sc.nextInt();

		potencia = calcularPotencia(base, expoente);
		System.out.println("Potencia: "+potencia);
	}

	private static int calcularPotencia(int base, int expoente) {
		int pot = 1;
		for (int i = 1; i <= expoente; i++) {
			pot *= base;
		}
		return pot;
	}

}
