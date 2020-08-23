package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
