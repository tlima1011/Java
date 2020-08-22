package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double r1 = 0, r2 = 0, r3 = 0;
		String triangulo = "";

		System.out.print("Informe a reta 1: ");
		r1 = sc.nextDouble();

		System.out.print("Informe a reta 2: ");
		r2 = sc.nextDouble();

		System.out.print("Informe a reta 3: ");
		r3 = sc.nextDouble();

		triangulo = informarTriangulo(r1, r2, r3);
		System.out.println(triangulo);

	}

	private static String informarTriangulo(double r1, double r2, double r3) {

		String formaTriangulo = "";

		if (r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2) {
			formaTriangulo = "Forma Triangulo ";
			if (r1 == r2 && r2 == r3) {
				formaTriangulo += "equilatero";
			} else if (r1 != r2 && r2 != r3) {
				formaTriangulo += "escaleno";
			} else {
				formaTriangulo += "isosceles";
			}
		} else {
			formaTriangulo = "Nao Forma Triangulo ";
		}
		return formaTriangulo;
	}
}
