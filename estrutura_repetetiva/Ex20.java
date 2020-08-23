package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex20 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int n = 0;
		String resultado = "";
				
		System.out.print("Informe o n�mero de idades: ");
		n = sc.nextInt(); 
		
		resultado = calcularMedia(n); 
		System.out.println(resultado);

	}

	private static String calcularMedia(int n) {
		
		String resultado = ""; 
		int idade, soma = 0; 
		double media = 0;
		
		for(int i = 0;i < n ;i++) {
			System.out.printf("Informe a %d� idade: ",(i +1));
			idade = sc.nextInt(); 
			soma += idade;
		}
		
		media = (double) soma / n;
		if(media <= 25) {
			resultado = "A media � jovem"; 
		}else if(media <= 60) {
			resultado = "A m�dia � adulta";
		}else {
			resultado = "A m�dia � idosa";
		}
		System.out.printf("M�dia = %.1f\n",media);
		return resultado;
	}

}
