package pacoteInstrucaoIfElse;

import java.math.*;
import java.util.*;

public class ifAninhado {

	public static void main(String[] args) {
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		n2 = entrada.nextInt();
		
		if (n1 ==n2)
			System.out.println("Os n�meros s�o iguauis.");
		else {
			if (n1 < n2)
				System.out.println("n1 � maior que n2.");
			else 
				System.out.println("n2 � maior que n1.");
			
		}
		

	}

}
