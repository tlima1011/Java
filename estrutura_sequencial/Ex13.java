package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioBruto = 0; 
		
		System.out.print("O salario R$");
		salarioBruto = sc.nextDouble();
		
		double salarioLiquido = calcularSalarioLiquido(salarioBruto); 
		System.out.printf("Salario Liquido R$%.2f",salarioLiquido);

	}

	private static double calcularSalarioLiquido(double sb) {
		double perc_sindicato = 0.05, perc_ir = 0.11, perc_inss = 0.08; 
		double sindicato = sb * perc_sindicato; 
		double ir = sb * perc_ir;
		double inss = sb * perc_inss;
		double descontos = sindicato + ir + inss; 
		System.out.printf("Salario Bruto R$%.2f\n", sb);
		System.out.printf("(%.1f) IR - R$%.2f\n", perc_ir * 100, ir);
		System.out.printf("(%.1f) INSS - R$%.2f\n", perc_inss * 100,inss);
		System.out.printf("(%.1f) Sindicato - R$%.2f\n", perc_sindicato * 100,sindicato);
		System.out.printf("Descontos - R$%.2f\n", descontos);
		return sb - descontos;
	}

}
