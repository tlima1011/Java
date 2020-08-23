package estrutura_repetitiva;

import java.util.Locale;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		System.out.println("Padaria Quase Dois - Tabela de preços"); 
		
		double preco = 0.18;
		System.out.printf("Preço do pão: R$%.2f\n", preco); 
		for(int i = 1; i <= 50;i++) {
			System.out.printf("%d - R$%.2f\n",i, preco);
			preco += 0.18;
		}
	}

}
