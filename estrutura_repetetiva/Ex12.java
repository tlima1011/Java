package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tabuada = 0;
		String res = "";
		System.out.print("Tabuada: ");
		tabuada = sc.nextInt();

		res = informarTabuada(tabuada);
		System.out.println(res);
	}

	private static String informarTabuada(int tabuada) {
		// TODO Auto-generated method stub
		String resultado = "";
		int produto;
		System.out.printf("Tabuada de %d:\n", tabuada);
		for (int i = 1; i <= 10; i++) {
			produto = tabuada * i;
			resultado += tabuada + " X " + i + " = " + produto + "\n";
		}
		return resultado;
	}
}
