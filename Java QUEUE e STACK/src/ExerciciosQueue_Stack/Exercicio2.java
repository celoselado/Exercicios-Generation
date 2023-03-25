package ExerciciosQueue_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack();
		int opcao;
		
		Scanner leia = new Scanner(System.in);
			
		
		do {
			System.out.println("\n**************************************");
			System.out.println("       Sistema Pilha de Livros       ");
			System.out.println("**************************************");
			System.out.println("(1) Adicionar um livro na pilha.");
			System.out.println("\n(2) Listar todos os livros.");
			System.out.println("\n(3) Retirar um livro da pilha.");
			System.out.println("\n(0) Encerrar sistema.");
			System.out.println("**************************************");
			
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				System.out.println("Obrigado por usar nosso sistema.");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("----------------------------------");
				System.out.println("Digite o nome do livro:           ");
				leia.nextLine();
				String livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("O livro "+livro+" foi adicionado! ");
				System.out.println("----------------------------------");
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("----------------------------------");
					System.out.println("A pilha de livros está vazia!!    ");
					System.out.println("----------------------------------");
				} else {
					System.out.println("------------------------------------------");
					System.out.println("Os livros existentes na pilha são: "+pilha);
					System.out.println("------------------------------------------");
				}
				break;
			case 3:
				System.out.println("-----------------------------------------------------");
				System.out.println("Digite o nome do livro que deseja retirar da pilha: ");
				leia.nextLine();
				livro = leia.nextLine();
				if(pilha.contains(livro)) {
					pilha.pop();
					System.out.println("------------------------------------------------");
					System.out.println("O livro "+livro+" foi retirado da pilha!");
					System.out.println("------------------------------------------------");
				} else {
					System.out.println("------------------------------------------------");
					System.out.println("O livro "+livro+" não foi encontrado na pilha!");
					System.out.println("------------------------------------------------");
				}
				break;
			default:
				System.out.println("Digite uma opção que seja válida!");
				
			}
		}while (opcao != 0);

	}

}
