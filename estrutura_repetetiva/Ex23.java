package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex23 {

	public static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Lojas Quase Dois - Tabela de preços"); 
		double preco = 1.99;
		
		for(int i = 1; i <= 50;i++) {
			System.out.printf("%d - R$%.2f\n",i, preco);
			preco += 1.99;
		}

	}

}
