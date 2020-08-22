package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char tipoCombustivel;
		double resultado = 0;

		do {
			System.out.print("Informe o tipo de Combustivel:\n[A] - Alcool\n[G] - Gasolina: ");
			tipoCombustivel = sc.next().charAt(0);
			tipoCombustivel = Character.toUpperCase(tipoCombustivel);
			if ((tipoCombustivel != 'A') && (tipoCombustivel != 'G')) {
				System.out.println("Invalido, informe tipo de Combustivel:\n[A] - Alcool\n[G] - Gasolina: ");
			}
		} while ((tipoCombustivel != 'A') && (tipoCombustivel != 'G'));

		resultado = calcularCombustivel(tipoCombustivel);
		System.out.printf("Valor a Pagar R$%.2f", resultado);
	}

	private static double calcularCombustivel(char tipoCombustivel) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double litros = 0, desconto = 0, preco = 0, valor = 0, precoUnitario = 0;
		// até 20 litros, desconto de 3% por litro
		// b. acima de 20 litros, desconto de 5% por litro

		switch (tipoCombustivel) {
		case 'A':
			System.out.print("Quantos litros de Alcool? ");
			litros = sc.nextDouble();

			preco = 1.90;
			if (litros < 20) {
				desconto = 0.03;
			} else {
				desconto = 0.05;
			}
			precoUnitario = preco * litros;
			valor = precoUnitario - (precoUnitario * desconto);
			break;
		case 'G':
			System.out.print("Quantos litros de Gasolina? ");
			litros = sc.nextDouble();

			preco = 2.50;
			if (litros < 20) {
				desconto = 0.04;
			} else {
				desconto = 0.06;
			}
			precoUnitario = preco * litros;
			valor = precoUnitario - (precoUnitario * desconto);
			break;
		}
		return valor;
	}

}
