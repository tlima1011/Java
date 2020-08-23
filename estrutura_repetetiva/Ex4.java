package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double popA = 80000, txA = 0.03, popB = 200000, txB = 0.015; 
		int anos = 0; 
				
		while(popA <= popB) {
			popA = popA + (popA *  txA);
			popB = popB + (popB * txB); 
			anos++; 
		}
		System.out.println("O número de anos para que A supere o B é de "+anos + " anos.");
				
		/*Supondo que a população de um país A seja da ordem de 80000
		habitantes com uma taxa anual de crescimento de 3% e que a
		população de B seja 200000 habitantes com uma taxa de crescimento
		de 1.5%. Faça um programa que calcule e escreva o número de anos
		necessários para que a população do país A ultrapasse ou iguale a
		população do país B, mantidas as taxas de crescimento.*/

	}

}
