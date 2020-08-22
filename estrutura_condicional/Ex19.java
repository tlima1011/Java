package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String multiplicacao = "", divisao = "", soma = "", subtracao = "";
		int num1 = 0, num2 = 0;
		char operacao;

		System.out.print("Informe o primeiro número: ");
		num1 = sc.nextInt();

		System.out.print("Informe o segundo número: ");
		num2 = sc.nextInt();

		System.out.print("Informe o tipo de operação " + "\nSoma [+] " + "\nSubtração [-]" + "\nMultiplicação [*]"
				+ "\nDivisão [/]: ");
		operacao = sc.next().charAt(0);
		operacao = Character.toUpperCase(operacao);

		switch (operacao) {
		case '+':
			soma = calcularSoma(num1, num2);
			System.out.print("Resultado da Soma: " + soma);
			break;
		case '-':
			subtracao = calcularSubtracao(num1, num2);
			System.out.print("Resultado da Subtração: " + subtracao);
			break;
		case '*': 
			multiplicacao = calcularMultiplicacao(num1, num2);
			System.out.print("Resultado da Multiplicação: " + multiplicacao);
			break;
		case '/': 
			divisao = calcularDivisao(num1, num2);
			System.out.print("Resultado da Divisão: " + divisao);
			break;
		default: 
			System.out.println("Inválido");
		}

	}

	private static String calcularDivisao(int num1, int num2) {
		
		String resultado = "";
		
		double divisao = (double) num1 / num2;
		if (divisao % 2 == 0) {
			resultado = "Par ";
			if (divisao > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		} else {
			resultado = "Impar ";
			if (divisao > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		}
		System.out.printf("Divisão: %.1f\n", divisao);
		return resultado;
	}

	private static String calcularMultiplicacao(int num1, int num2) {
		
		String resultado = "";
		double multiplicacao = (double) num1 * num2;
		if (multiplicacao % 2 == 0) {
			resultado = "Par ";
			if (multiplicacao > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		} else {
			resultado = "Impar ";
			if (multiplicacao > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		}
		System.out.printf("Multiplicação: %.0f\n", multiplicacao);
		return resultado;
	}

	private static String calcularSoma(int num1, int num2) {

		String resultado = "";
		int soma = num1 + num2;
		if (soma % 2 == 0) {
			resultado = "Par ";
			if (soma > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		} else {
			resultado = "Impar ";
			if (soma > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		}
		System.out.printf("A soma = %d\n", soma);
		return resultado;
	}

	private static String calcularSubtracao(int num1, int num2) {

		String resultado = "";
		int subtracao = num1 + num2;
		if (subtracao % 2 == 0) {
			resultado = "Par ";
			if (subtracao > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		} else {
			resultado = "Impar ";
			if (subtracao > 0) {
				resultado += "Positivo";
			} else {
				resultado += "Negativo";
			}
		}
		System.out.printf("A subtracao = %d\n", subtracao);
		return resultado;
	}
}
