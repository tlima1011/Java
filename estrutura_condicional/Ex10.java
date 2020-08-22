package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		char turno; 
		String resultado = ""; 
		
		System.out.print("Em que turno você estuda? ");
		turno = sc.next().charAt(0);
		turno = Character.toUpperCase(turno);
		resultado = informarBom(turno);
		System.out.println(resultado);
	}

	private static String informarBom(char t) {
		String resultado = "";
		switch(t) {
		case 'M': 
			resultado = "Bom Dia"; 
			break; 
		case 'V': 
			resultado = "Boa Tarde"; 
			break; 
		case 'N': 
			resultado = "Boa Noite"; 
			break; 
		default: 
			resultado = "Invalido";
			break;
		}
		return resultado;
	}

}
