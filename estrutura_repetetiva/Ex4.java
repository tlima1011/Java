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
		System.out.println("O n�mero de anos para que A supere o B � de "+anos + " anos.");
				
		/*Supondo que a popula��o de um pa�s A seja da ordem de 80000
		habitantes com uma taxa anual de crescimento de 3% e que a
		popula��o de B seja 200000 habitantes com uma taxa de crescimento
		de 1.5%. Fa�a um programa que calcule e escreva o n�mero de anos
		necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a
		popula��o do pa�s B, mantidas as taxas de crescimento.*/

	}

}
