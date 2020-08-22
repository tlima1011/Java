package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1 = 0, n2 = 0, n3 = 0;
		String resultado = "";

		System.out.print("Nota 1: ");
		n1 = sc.nextInt();

		System.out.print("Nota 2: ");
		n2 = sc.nextInt();

		System.out.print("Nota 3: ");
		n3 = sc.nextInt();

		resultado = ordemDecrescente(n1, n2, n3);
		System.out.printf("Ordem Decrescente = %s", resultado);

	}

	private static String ordemDecrescente(int n1, int n2, int n3) {
		
		String resultado = "";
		if (n1 > n2 && n1 > n3 && n2 > n3) {
			resultado = n1 + " " + n2 + " " + n3;
		} else if (n1 > n2 && n1 > n3 && n3 > n2) {
			resultado = n1 + " " + " " + n3 + " " + n2;
		} else if (n2 > n1 && n2 > n3 && n1 > n3) {
			resultado = n2 + " " + n1 + " " + n3;
		} else if (n2 > n1 && n2 > n3 && n3 > n1) {
			resultado = n2 + " " + n3 + " " + n1;
		} else if (n3 > n1 && n3 > n2 && n1 > n2) {
			resultado = n3 + " " + n1 + " " + n2;
		} else {
			resultado = n3 + " " + n2 + " " + n1;
		}
		return resultado;
	}

}
