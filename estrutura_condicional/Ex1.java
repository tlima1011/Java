package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int maior, n1 = 0, n2 = 0; 
		
		System.out.print("Informe o primeiro numero: ");
		n1 = sc.nextInt(); 
		
		System.out.print("Informe o segundo numero: ");
		n2 = sc.nextInt();
		
		maior = informarMaior(n1, n2); 
		System.out.printf("O maior número é %d", maior);

	}

	private static int informarMaior(int n1, int n2) {
		int maior = 0;
		if (n1 > n2) {
			maior = n1;
		}else {
			maior = n2;
		}
		return maior;
	}

}
