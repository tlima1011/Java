package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		String resultado = ""; 
		
		n = sc.nextInt(); 
		
		resultado = mostrarFibonacci(n); 
		System.out.println();
	}

	private static String mostrarFibonacci(int n) {
		
		int n3, n1 = 0, n2 = 1; 
		System.out.print(n1 + "  " +n2);
		for(int i = 0; i < n;i++) {
			 n3 = n1 + n2;
	         n1 = n2;
	         n2 = n3;
	         System.out.print(" "+n3 + " "); 
			
		}
		return "0";
	}

}
