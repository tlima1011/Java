package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero.: ");
		int num = sc.nextInt();
		
		String polaridade = informar(num);
		System.out.println(polaridade);
	}

	private static String informar(int num) {
		String resultado = ""; 
		if (num > 0) {
			resultado = "É positivo";
		}else {
			resultado = "É negativo";
		}
		return resultado;
	}

}
