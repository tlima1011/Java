package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tabuada = 0, inicio = 0, fim = 0; 
		
		System.out.print("Montar a tabuada de: ");
		tabuada = sc.nextInt(); 
		
		do {
			System.out.print("Começar por: ");
			inicio = sc.nextInt(); 
			System.out.print("Terminar em: ");
			fim = sc.nextInt();
			if(inicio > fim) {
				System.out.println("O início não pode ser maior que o final");
			}
		}while(inicio > fim); 
		 
		
		String res = ""; 
		res = calcularTabuada(tabuada, inicio, fim);
	}

	private static String calcularTabuada(int tabuada, int inicio, int fim) {
		
		String res = ""; 
		int produto = 0; 
		System.out.printf("Vou montar a tabuada de %d começando em %d e terminando em %d:\n", tabuada, inicio, fim);
		for(int i = inicio;i <= fim;i++) {
			produto = tabuada * i; 
			System.out.println(tabuada + " X " + i + " = " + produto); 
		}
		
		return res;
	}

}
