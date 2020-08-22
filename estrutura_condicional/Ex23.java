package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double kgFileDuplo = 0, kgAlcatra = 0, kgPicanha = 0, valorPagar = 0;

		System.out.print("Informe o kg de File Duplo: ");
		kgFileDuplo = sc.nextDouble();

		System.out.print("Informe o kg de Alcatra: ");
		kgAlcatra = sc.nextDouble();

		System.out.print("Informe o kg de Picanha: ");
		kgPicanha = sc.nextDouble();

		valorPagar = calcularValor(kgFileDuplo, kgAlcatra, kgPicanha);
		System.out.printf("Valor a pagar R$%.2f", valorPagar);

	}

	private static double calcularValor(double kgFileDuplo, double kgAlcatra, double kgPicanha) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char cartao;
		String cartao_extenso = "";
		double precoKgFileDuplo = 0, precoKgAlcatra = 0, precoKgPicanha = 0, precoTotal = 0, desconto = 0,
				valorPagar = 0, kgTotal = 0;

		if (kgFileDuplo < 5) {
			precoKgFileDuplo = 4.90;
		} else {
			precoKgFileDuplo = 5.80;
		}

		if (kgAlcatra < 5) {
			precoKgAlcatra = 5.90;
		} else {
			precoKgAlcatra = 6.80;
		}

		if (kgPicanha < 5) {
			precoKgPicanha = 6.90;
		} else {
			precoKgPicanha = 7.80;
		}

		precoKgFileDuplo = precoKgFileDuplo * kgFileDuplo;
		precoKgAlcatra = precoKgAlcatra * kgAlcatra;
		precoKgPicanha = precoKgPicanha * kgPicanha;

		precoTotal = precoKgFileDuplo + precoKgAlcatra + precoKgPicanha;
		kgTotal = kgFileDuplo + kgAlcatra + kgPicanha;

		System.out.print("Possui cartao tabajara\n[S]/[N]: ");
		cartao = sc.next().charAt(0);
		cartao = Character.toUpperCase(cartao);

		if (cartao == 'S') {
			desconto = 0.05;
			cartao_extenso = "Sim";
		} else {
			cartao_extenso = "Não";
		}
		valorPagar = precoTotal - (precoTotal * desconto);

		System.out.printf("Kg de file duplo %.1fkg - R$%.2f\n", kgFileDuplo, precoKgFileDuplo);
		System.out.printf("Kg de Alcatra %.1fkg - R$%.2f\n", kgAlcatra, precoKgAlcatra);
		System.out.printf("Kg de Picanha %.1fkg - R$%.2f\n", kgPicanha, precoKgPicanha);
		System.out.printf("Kg Total %.1fkg - Total R$%.2f\n", kgTotal, precoTotal);
		System.out.println("Card Tabajara " + cartao_extenso);
		System.out.printf("Desconto %.0f%%\n", desconto * 100);

		return valorPagar;
	}
}
