package projetoAula2_10;

public class operadoresRelacionais {

	public static void main(String[] args) {
		int var1 = 10, var2 = 20, var3 = 20;
		boolean resultado, resultado2, resultado3, resultado4, resultado5, resultado6;
		
		resultado = (var1 == var2); // � igual
		resultado2 = (var2 == var3); // --
		resultado3 = (var1 != var2); // � diferente
		resultado4 = (var1 > var2); // � maior
		resultado5 = (var1 < var3); // � menor
		resultado6 = (var2 >= var3); // � maior ou igual
		System.out.printf("As vari�veis s�o iguais? \nResposta: %b", resultado);
		System.out.printf("\nAs vari�veis s�o iguais? \nResposta: %b", resultado2);
		System.out.printf("\nAs vari�veis s�o diferentes? \nResposta: %b", resultado3);
		System.out.printf("\nA vari�vel var1 � maior que var2? \nResposta: %b", resultado4);
		System.out.printf("\nA vari�vel var1 � menor que var3? \nResposta: %b", resultado5);
		System.out.printf("\nA vari�vel var2 � maior ou igual que var3? \nResposta: %b", resultado6);

	}

}
