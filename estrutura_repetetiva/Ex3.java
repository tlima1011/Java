package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		char sexo, estadoCivil;
		double salario = 0;

		do {
			System.out.print("Informe o nome: ");
			nome = sc.next();
			if (nome.length() < 3) {
				System.out.println("N�o pode ser menos de 3");
			}
		} while (nome.length() < 3);
		System.out.println("Nome v�lido");

		do {
			System.out.print("Informe a idade: ");
			idade = sc.nextInt();
			if (idade < 0 || idade > 150) {
				System.out.println("Idade n�o pode ser menor que 0 e maior que 150");
			}
		} while (idade < 0 || idade > 150);
		System.out.println("Idade v�lida");

		do {
			System.out.print("Sal�rio R$");
			salario = sc.nextDouble();
			if (salario < 0) {
				System.out.println("Sal�rio n�o pode ser menor que 0: ");
			}
		} while (salario < 0);
		System.out.println("Sal�rio V�lido");

		do {
			System.out.print("Sexo \n[M] - [F]: ");
			sexo = sc.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			if (sexo != 'M' && sexo != 'F') {
				System.out.println("Sexo n�o pode ser M ou F: ");
			}
		} while (sexo != 'M' && sexo != 'F');
		System.out.println("Sexo V�lido");

		do {
			System.out.print("Sexo \n[S] - [C] - [V] - [D]: ");
			estadoCivil = sc.next().charAt(0);
			estadoCivil = Character.toUpperCase(estadoCivil);
			if (estadoCivil != 'S' && estadoCivil != 'V' && estadoCivil != 'C' && estadoCivil != 'D') {
				System.out.println("Sexo n�o pode ser M ou F: ");
			}
		} while (estadoCivil != 'S' && estadoCivil != 'V' && estadoCivil != 'C' && estadoCivil != 'D');
		System.out.println("Sexo V�lido");
		
		System.out.println("\nDados V�lidos: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.printf("Sal�rio R$%.2f\n", salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
}
