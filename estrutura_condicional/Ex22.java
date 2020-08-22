package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double kgMorango = 0, kgMaca = 0, valorPagar = 0;
		
		System.out.print("Informe o kg de morango: ");
		kgMorango = sc.nextDouble(); 
		
		System.out.print("Informe o kg de maca: ");
		kgMaca = sc.nextDouble(); 
		
		valorPagar = calcularValor(kgMorango, kgMaca);
		System.out.printf("Valor a pagar R$%.2f", valorPagar);

	}

	private static double calcularValor(double kgMorango, double kgMaca) {
		
		double precoKgMorango = 0, precoKgMaca = 0, precoTotal = 0, desconto = 0, valorPagar = 0, kgTotal = 0; 
		
		if(kgMorango < 5) {
			precoKgMorango = 2.50;
		}else {
			precoKgMorango = 2.20;
		}
		
		if(kgMaca < 5) {
			precoKgMaca = 1.50;
		}else {
			precoKgMaca = 1.80;
		}
		
		precoKgMorango = precoKgMorango * kgMorango;
		precoKgMaca = precoKgMaca * kgMaca; 
		precoTotal = precoKgMorango + precoKgMaca; 
		kgTotal = kgMorango + kgMaca; 
		
		if(precoTotal > 25 || kgTotal > 8) {
			desconto = 0.10; 
		}
		valorPagar = precoTotal - (precoTotal * desconto); 
		System.out.printf("Kg de morango %.1fkg - R$%.2f\n", kgMorango, precoKgMorango);
		System.out.printf("Kg de maçã %.1fkg - R$%.2f\n", kgMaca, precoKgMaca);
		System.out.printf("Kg Total %.1fkg - Total R$%.2f\n", kgTotal, precoTotal);
		System.out.printf("Desconto %.0f%%\n", desconto * 100);
		return valorPagar;
	}

}
