package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double salario = 0, novoSalario = 0; 
		
		System.out.print("Informe o valor do salario em R$");
		salario = sc.nextDouble(); 

		novoSalario = calcularNovoSalario(salario); 
		System.out.printf("Novo Salário R$%.2f", novoSalario);
	}

	private static double calcularNovoSalario(double s) {
		
		double salario = 0; 
		int ano = 1996; 
		
		for(int i = 1996; i <= 2000; i++) {
			salario = s + (s * 0.015); 
		}
		return salario;
	}
}
