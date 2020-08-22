package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String veredito = "";
		char telefonou, local, mora, deve, trabalhou;

		System.out.print("Telefonou para a vítima? ");
		telefonou = sc.next().charAt(0);
		telefonou = Character.toUpperCase(telefonou);

		System.out.print("Esteve no local do crime? ");
		local = sc.next().charAt(0);
		local = Character.toUpperCase(telefonou);

		System.out.print("Mora perto da vítima? ");
		mora = sc.next().charAt(0);
		mora = Character.toUpperCase(mora);

		System.out.print("Devia para a vítima?");
		deve = sc.next().charAt(0);
		deve = Character.toUpperCase(deve);

		System.out.print("Já trabalhou com a vítima?");
		trabalhou = sc.next().charAt(0);
		trabalhou = Character.toUpperCase(trabalhou);

		veredito = informarVeredito(telefonou, local, mora, deve, trabalhou);
		System.out.println(veredito);
	}

	private static String informarVeredito(char telefonou, char local, char mora, char deve, char trabalhou) {

		String veredito = "";
		int total = 0, pontoTelefonou = 0, pontoLocal = 0, pontoMora = 0, pontoDeve = 0, pontoTrabalhou = 0;

		if (telefonou == 'S') {
			pontoTelefonou++;
		}
		if (local == 'S') {
			pontoLocal++;
		}
		if (mora == 'S') {
			pontoMora++;
		}
		if (deve == 'S') {
			pontoDeve++;
		}
		if (trabalhou == 'S') {
			pontoTrabalhou++;
		}

		total = pontoTelefonou + pontoLocal + pontoMora + pontoDeve + pontoTrabalhou;

		if (total == 1 || total == 0) {
			veredito = "Inocente";
		} else if (total == 2) {
			veredito = "Cumplice";
		} else if (total == 3 || total == 4) {
			veredito = "Suspeita";
		} else if(total == 5) {
			veredito = "Assassino";
		}
		return veredito;
	}

}
