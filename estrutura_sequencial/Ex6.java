package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in); 
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o raio do circulo: ");
		double raio = sc.nextDouble(); 
		
		double area = calcularArea(raio);
		System.out.printf("Area do circulo %.2f", area);
	}

	private static double calcularArea(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}

}
