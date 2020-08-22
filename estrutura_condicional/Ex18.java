package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String resultado = "";
		int num = 0;
		
		System.out.print("Informe um número: ");
		num = sc.nextInt();
		
		resultado = informarParImpar(num);
		System.out.println(resultado);
	}

	private static String informarParImpar(int num) {

		String res = "";

		if (num % 2 == 0) {
			res = "É par";
		} else {
			res = "É impar";
		}
		return res;
	}

}
