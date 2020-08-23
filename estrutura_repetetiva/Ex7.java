package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int maior = 0, numero = 0; 
		
		for(int i = 0; i < 5;i++) {
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero; 
			}
		}
		System.out.println("O maior número é: " +maior);
	}

}
