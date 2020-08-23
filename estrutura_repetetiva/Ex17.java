package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = 0, fatorial = 0;
		String resultado = "";

		System.out.print("Informe o fatorial.: ");
		numero = sc.nextInt(); 
				
		fatorial = mostrarFatorial(numero);
		System.out.print(fatorial);
	}

	private static int mostrarFatorial(int numero) {

		int f = 1;
		
		System.out.print(numero+"! = ");
		for (int i = numero; i >= 1; i--) {
			if(i == 1) {
				System.out.print(i+" = ");
			}else {
				System.out.print(i+" . ");
			}
			f *= i;
		}
		//System.out.print(" = ");
		return f;
	}

}
