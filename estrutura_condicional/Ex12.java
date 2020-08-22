package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int horasTrabalhadas = 0; 
		double valorHora = 0, salarioLiquido = 0; 
		
		System.out.print("Quantas horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt(); 
		
		System.out.print("Qual valor por hora: ");
		valorHora = sc.nextDouble(); 
		
		salarioLiquido = calcularSl(valorHora, horasTrabalhadas); 
		System.out.printf("Salario Liquido: R$%.2f", salarioLiquido);
		
	}

	private static double calcularSl(double valorHora, int horasTrabalhadas) {
		double desconto = 0, ir = 0, perc_ir = 0, inss = 0, perc_inss = 0.10, sindicato = 0, perc_sindicato = 0, fgts = 0, perc_fgts = 0.11; 
		
		double salarioBruto = valorHora * horasTrabalhadas; 
		
		if(salarioBruto <= 900) {
			perc_ir = 0;
		}else if(salarioBruto <= 1500) {
			perc_ir = 0.05;
		}else if(salarioBruto <= 2500) {
			perc_ir = 0.10;
		}else {
			perc_ir = 0.15;
		}
		
		ir = salarioBruto * perc_ir; 
		inss = salarioBruto * perc_inss; 
		fgts = salarioBruto * perc_fgts;
		desconto = ir + inss;
		
		System.out.printf("Salário Bruto: (%.0f) * (%d) = R$%.2f\n", valorHora, horasTrabalhadas,salarioBruto);
		System.out.printf("IR (%.0f%%) : R$%.2f\n", perc_ir * 100,ir);
		System.out.printf("INSS (%.0f%%) : R$%.2f\n", perc_inss * 100,inss);
		System.out.printf("FGTS (%.0f%%) : R$%.2f\n", perc_fgts * 100,fgts);
		System.out.printf("Total de descontos : R$%.2f\n", desconto); 
		
		return salarioBruto - desconto;
	}

}
