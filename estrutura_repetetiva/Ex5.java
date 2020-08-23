package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int popA = 0 , popB = 0; 
		double txA = 0, txB = 0; 
		int anos = 0; 
		
		do {
			System.out.print("População A: ");
			popA = sc.nextInt();
			System.out.print("Taxa A: ");
			txA = sc.nextDouble();
			System.out.print("População B: ");
			popB = sc.nextInt();
			System.out.print("Taxa B: ");
			txB = sc.nextDouble();
			if(popA > popB) {
				System.out.println("Populaçao de A não pode ser maior que B: ");
			}
		}while(popA > popB);		
				
		while(popA <= popB) {
			popA = (int) (popA + (popA *  txA));
			popB = (int) (popB + (popB * txB)); 
			anos++; 
		}
		System.out.println("O número de anos para que A supere o B é de "+anos + " anos.");

	}

}
