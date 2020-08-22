package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco1 = 0, preco2 = 0, preco3 = 0, maisBarato = 0;

		System.out.print("Preco 1: R$");
		preco1 = sc.nextDouble();  
		
		System.out.print("Preco 2: R$");
		preco2 = sc.nextDouble();  
		
		System.out.print("Preco 3: R$");
		preco3 = sc.nextDouble();  
				
		
		maisBarato = informarMenor(preco1, preco2,preco3);
		System.out.printf("Mais Barato R$%.2f", maisBarato);
	}

	private static double informarMenor(double preco1, double preco2, double preco3) {
		double barato = 0;
		if(preco1 < preco2 && preco1 < preco3) {
			barato = preco1;
		}else if(preco2 < preco3) {
			barato = preco2;
		}else {
			barato = preco3;
		}
		return barato;
	}

}
