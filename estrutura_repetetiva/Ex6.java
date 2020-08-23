package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		for (int i = 21; i <= 31; i++) {
			System.out.print(i + " ");
		}
	}
}
