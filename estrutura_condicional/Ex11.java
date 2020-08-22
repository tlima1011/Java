package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double salario = 0; 
		System.out.print("Informe o salario R$");
		salario = sc.nextDouble(); 
				
		salario = calcularNovoSalario(salario); 
		System.out.printf("Salario Liquido R$%.2f", salario);
	}

	private static double calcularNovoSalario(double s) {
		
		double perc_aumento = 0, aumento = 0; 
		
		if(s >= 0 && s <= 280) {
			perc_aumento = 0.20;
		}else if(s <= 700) {
			perc_aumento = 0.15; 
		}else if(s <= 1500) {
			perc_aumento = 0.10; 
		}else {
			perc_aumento = 0.05; 
		}
		
		aumento = s * perc_aumento; 
		perc_aumento *= 100; 
		System.out.printf("Valor do Aumento R$%.2f\n",aumento);
		System.out.printf("Porcentagem de aumento %.0f%%\n", perc_aumento);
		System.out.printf("Salario Bruto R$%.2f\n", s); 
				
		return s + aumento;
	}

}
