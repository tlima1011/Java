package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = 0, qtde = 0;
		double precoTotal = 0, preco = 0;
		char resp;

		System.out.println("------------------------------");
		System.out.println("Especificação	Código	Preço");
		System.out.println("------------------------------");
		System.out.println("Cachorro Quente  100    R$1.20");
		System.out.println("Bauru Simples    101    R$1.30");
		System.out.println("Bauru com ovo    102    R$1.50");
		System.out.println("Hambúrguer       103    R$1.20");
		System.out.println("Cheeseburguer    104    R$1.30");
		System.out.println("Refrigerante 	 105 	R$1.00");
		System.out.println("------------------------------");
		do {
			System.out.print("Informe o código: ");
			codigo = sc.nextInt();
			switch (codigo) {
			case 100:
				System.out.print("Informe a quantidade de Cachorro Quente: ");
				qtde = sc.nextInt();
				preco = calcularPrecoCachorro(qtde);
				break;
			case 101:
				System.out.print("Informe a quantidade de Bauru Simples: ");
				qtde = sc.nextInt();
				preco = calcularPrecoBauruSimples(qtde);
				break;
			case 102:
				System.out.print("Informe a quantidade de Bauru com Ovo: ");
				qtde = sc.nextInt();
				preco = calcularPrecoBauruComOvo(qtde);
				break;
			case 103:
				System.out.print("Informe a quantidade de Hambúrguer: ");
				qtde = sc.nextInt();
				preco = calcularPrecoHamburguer(qtde);
				break;
			case 104:
				System.out.print("Informe a quantidade de Cheeseburguer: ");
				qtde = sc.nextInt();
				preco = calcularPrecoCheeseburguer(qtde);
				break;
			case 105:
				System.out.print("Informe a quantidade de Refrigerante: ");
				qtde = sc.nextInt();
				preco = calcularPrecoRefrigerante(qtde);
				break;
			default:
				System.out.println("Digite um valor novamente");
			}
			precoTotal += preco;
			System.out.print("Deseja continuar [S] - [N]: ");
			resp = sc.next().charAt(0);
			resp = Character.toUpperCase(resp);
		} while (resp == 'S');
		System.out.printf("Valor total R$%.2f", precoTotal);
	}

	private static double calcularPrecoRefrigerante(int qtde) {

		return qtde * 1.00;
	}

	private static double calcularPrecoCheeseburguer(int qtde) {

		return qtde * 1.30;
	}

	private static double calcularPrecoHamburguer(int qtde) {

		return qtde * 1.20;
	}

	private static double calcularPrecoBauruComOvo(int qtde) {

		return qtde * 1.50;
	}

	private static double calcularPrecoBauruSimples(int qtde) {

		return qtde * 1.30;
	}

	private static double calcularPrecoCachorro(int qtde) {

		return qtde * 1.20;
	}

}
