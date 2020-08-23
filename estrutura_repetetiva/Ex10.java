package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//Exercicio 10 e 11 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1 = 0, n2 = 0, soma = 0;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for (int i = n1; i < n2; i++) {
			if (i == n1) {
				i += 1;
				System.out.print(i + " ");
			} else {
				System.out.print(i + " ");
			}
		soma += i;
		}
		System.out.println("\nA soma = "+soma);
	}
}
