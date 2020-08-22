package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char letra;

		System.out.print("Informe uma letra: ");
		letra = sc.next().charAt(0);
		letra = Character.toUpperCase(letra);
		String l = informarLetra(letra);
		System.out.println(l);
	}

	private static String informarLetra(char l) {
		String letra = "";
		if (l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
			letra = "A letra eh vogal";
		} else {
			letra = "A letra eh consoante";
		}
		return letra;
	}
}
