package pacoteWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		char saida = 'N';
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		while (saida != 'S') {                           //while s� para o looping quando o valor bater o que ele estipulou
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Gostaria de sair? S = sim, N = N");
			saida = entrada.nextLine().charAt(0);	
			somatorio = somatorio + numero;
		}
		System.out.printf("O somat�rio �: %d", somatorio);

	}

}
