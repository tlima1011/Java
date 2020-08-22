package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int horas = 0; 
		double valorHora = 0, salario = 0; 
		
		System.out.print("Quantas horas trabalhadas: ");
		horas = sc.nextInt(); 
		
		System.out.print("Valor por hora R$");
		valorHora = sc.nextDouble(); 
		
		salario = calcularSalario(horas, valorHora);
		System.out.printf("Salario em R$%.2f",salario);
	}

	private static double calcularSalario(int horas, double valorHora) {
		return horas * valorHora;
	}

}
