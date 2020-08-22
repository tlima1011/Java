package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ano = 0;
		String resultado = "";

		System.out.print("Informe o ano: ");
		ano = sc.nextInt();

		resultado = informarBissexto(ano);
		System.out.print(resultado);

	}

	private static String informarBissexto(int ano) {

		String res = "";
		if (ano % 400 == 0 || ano % 4 == 0) {
			res = "O ano é bissexto";
		} else {
			res = "O ano não é bissexto";
		}
		return res;
	}

}
