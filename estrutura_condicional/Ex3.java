package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char sexo;

		System.out.print("Informe o sexo [M] - [F]: ");
		sexo = sc.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		String sx = informarSexo(sexo);
		System.out.println(sx);
	}

	private static String informarSexo(char sexo) {
		String sx = "";
		switch (sexo) {
		case 'M':
			sx = "Masculino";
			break;
		case 'F':
			sx = "Feminino";
			break;
		default:
			sx = "Invalido";
		}
		return sx;
	}

}
