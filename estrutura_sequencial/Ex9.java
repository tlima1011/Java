package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double f, celsius = 0;
		System.out.print("Valor em Farenheit: ");
		f = sc.nextDouble();
		
		celsius = converterCelsius(f);
		System.out.printf("Valor em Celsius %.1fº", celsius);
	}

	private static double converterCelsius(double f) {
		return 5 * (f - 32) / 9.0;
	}
}
