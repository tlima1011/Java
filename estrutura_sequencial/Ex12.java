package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura = 0, peso = 0; 
		System.out.print("Informe a altura: ");
		altura = sc.nextDouble();
		
		peso = calcularPesoIdeal(altura);
		System.out.printf("Peso Ideal %.2fkg",peso);
	}

	private static double calcularPesoIdeal(double a) {
		return 72.7* a - 58;
	}

}
