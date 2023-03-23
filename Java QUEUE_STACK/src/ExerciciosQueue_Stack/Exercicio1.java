package ExerciciosQueue_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList();
		int opcao;
		
		Scanner leia = new Scanner(System.in);
			
		
		do {
				
			System.out.println("\n**************************************");
			System.out.println("       Sistema Fila de Clientes       ");
			System.out.println("**************************************");
			System.out.println("(1) Adicionar um novo cliente.");
			System.out.println("\n(2) Listar todos os clientes.");
			System.out.println("\n(3) Retirar cliente da fila.");
			System.out.println("\n(0) Encerrar sistema.");
			System.out.println("**************************************");
				
			opcao = leia.nextInt();
				
			if(opcao == 0) {
				System.out.println("Obrigado por usar o nosso sistema!");
				leia.close();
				System.exit(0);
			}
				
			switch(opcao) {
			case 1:
				System.out.println("------------------------------------------");
				System.out.println("Digite o nome do cliente: ");
				leia.nextLine();
				String nome = leia.nextLine();
				clientes.add(nome);
				System.out.println("O cliente "+nome+" foi inserido!");
				System.out.println("------------------------------------------");
				break;
			case 2:
				if(clientes.isEmpty()) {
					System.out.println("-----------------------------");
					System.out.println("A fila esta vazia!");
					System.out.println("-----------------------------");
				} else {
						System.out.println(clientes);
				}
				break;
			case 3:
				System.out.println("----------------------------------------------------------");
				System.out.println("Digite o nome do cliente que deseja remover da fila: ");
				leia.nextLine();
				nome = leia.nextLine();
				if(clientes.contains(nome)) {
					clientes.remove(nome);
					System.out.println("-----------------------------------------");
					System.out.println("O cliente "+nome+" foi removido da fila.");
					System.out.println("-----------------------------------------");
				} else {
					System.out.println("----------------------------------------");
					System.out.println("O cliente "+nome+" não esta na fila!");
					System.out.println("----------------------------------------");
				}
				break;
			default:
				System.out.println("Digite uma opção válida!!");
			}
		}while(opcao != 0);	

	}

}
