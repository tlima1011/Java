package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, n3 = 0, maior = 0;
		
		System.out.print("Nota 1: ");
		n1 = sc.nextInt();  
		
		System.out.print("Nota 2: ");
		n2 = sc.nextInt();  
		
		System.out.print("Nota 3: ");
		n3 = sc.nextInt();  
				
		maior = informarMaior(n1, n2,n3);
		int menor = informarMenor(n1, n2,n3);
		System.out.printf("Maior = %d\n",maior);
		System.out.printf("Menor = %d", menor);
	}

	private static int informarMenor(int n1, int n2, int n3) {
		int menor = 0;
		if(n1 < n2 && n1 < n3) {
			menor = n1;
		}else if(n2 < n3) {
			menor = n2;
		}else {
			menor = n3;
		}
		return menor;
	}

	private static int informarMaior(int n1, int n2, int n3) {
		int maior = 0;
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}else if(n2 > n3) {
			maior = n2;
		}else {
			maior = n3;
		}
		return maior;
	}
}


