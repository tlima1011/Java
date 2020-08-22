package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = 0, nota2 = 0;
		String resultado = "";

		System.out.print("Informe a nota 1: ");
		nota1 = sc.nextDouble();

		System.out.print("Informe a nota 2: ");
		nota2 = sc.nextDouble();

		resultado = informarConceito(nota1, nota2);
		System.out.println(resultado);

	}

	private static String informarConceito(double n1, double n2) {

		char conceito;
		String res = "";

		double media = (n1 + n2) / 2.0;
		if (media >= 0 && media <= 4) {
			conceito = 'E';
		} else if (media <= 6) {
			conceito = 'D';
		} else if (media <= 7.5) {
			conceito = 'C';
		} else if (media <= 9) {
			conceito = 'B';
		} else {
			conceito = 'A';
		}

		switch (conceito) {
		case 'E':
		case 'D':
			res = "REPROVADO";
			break;
		default:
			res = "APROVADO";
			break;
		}
		System.out.printf("Conceito %c\n", conceito);
		System.out.printf("Media = %.1f\n",media);
		return res;
	}
}
