package estrutura_condicional;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = 0, b = 0, c = 0;
		String resultado = "";

		System.out.print("Informe o coeficiente A: ");
		a = sc.nextDouble();

		System.out.print("Informe o coeficiente B: ");
		b = sc.nextDouble();

		System.out.print("Informe o coeficiente C: ");
		c = sc.nextDouble();

		resultado = calcularEquacao(a, b, c);
		System.out.println(resultado);

	}

	private static String calcularEquacao(double a, double b, double c) {
		StringBuilder resultado = new StringBuilder();
		String res = "";
		double x1 = 0, x2 = 0;
		double delta = Math.pow(b, 2) - (4 * a * c);

		if (a == 0 && delta < 0) {
			res = "Não existe raizes reais";
		} else {
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
			DecimalFormat decimalFormat = new DecimalFormat("#,##0.0000");
	        decimalFormat.setRoundingMode(RoundingMode.DOWN);
	        System.out.println("X1 = "+ decimalFormat.format(x1));
	        System.out.println("X2 = "+ decimalFormat.format(x2));
	        res = "";
		}
		return res;
	}

}
