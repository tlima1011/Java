package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota = 0; 
		
		do {
			System.out.print("Informe uma nota.: ");
			nota = sc.nextDouble(); 
			if(nota < 0 || nota > 10) {
				System.out.println("Invalido, digite uma nota entre 0 e 10:");
			}
		}while(nota < 0 || nota > 10);
		System.out.println("Nota valida");
		/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
		mensagem caso o valor seja inv�lido e continue pedindo at� que o
		usu�rio informe um valor v�lido.*/
	}
}
