package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		double preco = 0, total = 0, troco = 0, dinheiro, precoTotal = 0;
		int cont = 0;

		do {
			cont++;
			System.out.printf("Produto %d: R$", cont);
			preco = sc.nextDouble();
			total += preco;
		} while (preco != 0);
		
		troco = calcularPreco(total); 
		System.out.printf("Troco R$%.2f", troco);
		
		
	}

	private static double calcularPreco(double total) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Total: R$%.2f\n", total);
		System.out.print("Dinheiro R$");
		double dinheiro = sc.nextDouble();
		System.out.printf("Dinheiro: R$%.2f\n", dinheiro);
		double troco = dinheiro - total;
				
		return troco;
	}
}
