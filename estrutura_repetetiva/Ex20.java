package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex20 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int n = 0;
		String resultado = "";
				
		System.out.print("Informe o número de idades: ");
		n = sc.nextInt(); 
		
		resultado = calcularMedia(n); 
		System.out.println(resultado);

	}

	private static String calcularMedia(int n) {
		
		String resultado = ""; 
		int idade, soma = 0; 
		double media = 0;
		
		for(int i = 0;i < n ;i++) {
			System.out.printf("Informe a %dª idade: ",(i +1));
			idade = sc.nextInt(); 
			soma += idade;
		}
		
		media = (double) soma / n;
		if(media <= 25) {
			resultado = "A media é jovem"; 
		}else if(media <= 60) {
			resultado = "A média é adulta";
		}else {
			resultado = "A média é idosa";
		}
		System.out.printf("Média = %.1f\n",media);
		return resultado;
	}

}
