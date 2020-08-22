package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String res = "";

		System.out.print("Informe um numero para dia da semana: ");
		int dia = sc.nextInt();

		res = informarDia(dia);
		System.out.println(res);
	}

	private static String informarDia(int d) {

		String diaSemana = "";

		switch (d) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda";
			break;
		case 3:
			diaSemana = "Terça";
			break;
		case 4:
			diaSemana = "Quarta";
			break;
		case 5:
			diaSemana = "Quinta";
			break;
		case 6:
			diaSemana = "Sexta";
			break;
		case 7:
			diaSemana = "Sabado";
			break;
		default:
			diaSemana = "Invalido";
			break;
		}
		return diaSemana;
	}
}
