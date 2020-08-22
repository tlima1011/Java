package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Informe o lado do Quadrado: ");
		double lado = sc.nextDouble();

		double area = calcularAreaQuadrado(lado);
		System.out.printf("Area do retangulo = %.1f", area);
	}

	private static double calcularAreaQuadrado(double l) {
		return l * l;
	}

}
