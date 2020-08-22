package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o valor em metros: ");
		double metros = sc.nextDouble(); 

		double cm = converterCm(metros); 
		System.out.printf("%.1fm equivale a %.1fcm ",metros,cm);
	}
	
	private static double converterCm(double m) {
		return m * 100; 
	}

}
