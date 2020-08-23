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
			System.out.print("Popula��o A: ");
			popA = sc.nextInt();
			System.out.print("Taxa A: ");
			txA = sc.nextDouble();
			System.out.print("Popula��o B: ");
			popB = sc.nextInt();
			System.out.print("Taxa B: ");
			txB = sc.nextDouble();
			if(popA > popB) {
				System.out.println("Popula�ao de A n�o pode ser maior que B: ");
			}
		}while(popA > popB);		
				
		while(popA <= popB) {
			popA = (int) (popA + (popA *  txA));
			popB = (int) (popB + (popB * txB)); 
			anos++; 
		}
		System.out.println("O n�mero de anos para que A supere o B � de "+anos + " anos.");

	}

}
