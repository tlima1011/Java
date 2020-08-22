package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Informe um numero: ");
		int num = sc.nextInt();

		System.out.println(informarNumero(num)); // O número informado foi [número].
	}

	private static String informarNumero(int num) {
		return "O numero informado foi " + num;
	}

}
