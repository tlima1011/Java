package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int n = 0;
		double media = 0;

		System.out.print("Informe o número de turmas: ");
		n = sc.nextInt();

		media = calcularMediaAlunos(n);
		System.out.printf("Média de alunos %.1f", media);

	}

	private static double calcularMediaAlunos(int n) {

		double soma = 0;
		int alunos = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Informe a quantidade de alunos da %dª turma:\n",(i+1));
			do {
				System.out.print("Alunos: ");
				alunos = sc.nextInt();
				if (alunos > 40) {
					System.out.println("Inválido, não pode ser maior que 40 alunos");
				}
				soma += alunos;
			} while (alunos > 40);
		}
		return soma / n;
	}
}
