package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex27 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n;
		double media = 0;

		System.out.print("Quantas temperaturas serão calculadas: ");
		n = sc.nextInt();

		media = calcularTemps(n);
		System.out.printf("Média das temperaturas %.1fºC", media);
	}

	private static double calcularTemps(int n) {

		Locale.setDefault(Locale.US);

		double temp = 0, soma = 0, menor = 0, maior = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Informe a %d temperatura: ", (i+1));
			temp = sc.nextDouble();
			soma += temp;
			if (i == 0) {
				menor = temp;
				maior = temp;
			} else {
				if (temp > maior) {
					maior = temp;
				}
				if (temp < menor) {
					menor = temp;
				}
			}
		}
		System.out.printf("\nMenor Temperatura %.1fºC\n", menor);
		System.out.printf("Maior Temperatura %.1fºC\n", maior);
		return soma / n;
	}

}
