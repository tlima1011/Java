package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String usuario = "", senha = "";

		do {
			System.out.print("Informe usuario: ");
			usuario = sc.next();
			System.out.print("Informe senha: ");
			senha = sc.next();
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usuário e senha inválida digite diferentes");
			}
		} while (usuario.equalsIgnoreCase(senha));
		System.out.println("Concedido");
	}
}
