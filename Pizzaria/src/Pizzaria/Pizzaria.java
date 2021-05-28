package Pizzaria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Pizzaria {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<String> contatos = new ArrayList<>();
	private Queue<String> fila = new LinkedList<>();
	private Stack<Integer> pilha = new Stack<>(); 
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("1 - Consultar lista de contatos \n");
		sb.append("2 - Inserir contato na lista de contatos \n");
		sb.append("3 - Remover contato na lista de contatos \n");
		sb.append("4 - Inserir pedido na fila \n");
		sb.append("5 - Remover pedido na fila \n");
		sb.append("6 - Organizar as entregas \n");
		sb.append("7 - Desempilhar pedido \n");
		sb.append("8 - Sair \n");
		System.out.println(sb.toString());
		
		return scanner.nextLine();
	}
	
	public void iniciar() {
		String opcao = mostrarMenu();
		while (!opcao.equals("8")) {
			switch (opcao) {
			case "1":
				System.out.println(contatos);
				opcao = mostrarMenu();
				break;
			case "2":
				System.out.println("Digite o nome do contato:");
				String nome = scanner.nextLine();
				contatos.add(nome);
				opcao = mostrarMenu();
				break;
			case "3":
				System.out.println("Digite o índice do contato que deseja remover:");
				int indice = Integer.valueOf(scanner.nextLine());
				contatos.remove(indice);
				opcao = mostrarMenu();
				break;
			case "4":
				System.out.println("Digite o nome do cliente para entrar na fila:");
				fila.add(scanner.nextLine());
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "5":
				fila.remove();
				System.out.println("Cliente chamado: " + fila.remove());
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "6":
				System.out.println("Digite a lista de distâncias para organizar:");
				String str[] = scanner.nextLine().split(",");
				ArrayList<Integer> distancias = new ArrayList<>();
				for (int i = 0; i < str.length; i++) {
					distancias.add(Integer.valueOf(str[i]));
				}	
				while (!distancias.isEmpty()) {
					int indiceMaiorDistancia = 0;
					int maiorDistancia = distancias.get(indiceMaiorDistancia);
					for (int i = 0; i < distancias.size(); i++) {
						if (distancias.get(i) > maiorDistancia) {
							maiorDistancia = distancias.get(i);
							indiceMaiorDistancia = i;
						}
					}
					pilha.add(maiorDistancia);
					distancias.remove(indiceMaiorDistancia);	
				}
				System.out.println(pilha);
				opcao = mostrarMenu();
				break;
			case "7":
				System.out.println("Elemento removido: " + pilha.pop());
				opcao = mostrarMenu();
				break;
			default: 
				System.out.println("Opção inválida.");
				opcao = mostrarMenu();
			}
		}
    }
}