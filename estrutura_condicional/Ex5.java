package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = 0, nota2 = 0, media = 0;
		
		System.out.print("Nota 1: ");
		nota1 = sc.nextDouble(); 
		
		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble(); 
		
		media = calcularMedia(nota1, nota2);
		System.out.printf("A media = %.1f",media);
	}

	private static double calcularMedia(double nota1, double nota2) {
		double m = (nota1 + nota2) / 2.0; 
		String situacao = ""; 
		if (m < 7) {
			situacao = "Reprovado";
		}else if(m < 10) {
			situacao = "Aprovado";
		}else {
			situacao = "Aprovado com distincao";
		}
		System.out.println(situacao);
		return m;
	}

}
