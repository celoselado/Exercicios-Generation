package Conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Conta.model.ContaCorrente;
import Conta.model.ContaPoupanca;
import Conta.controller.ContaController;
import Conta.model.Conta;
import Conta.util.Cores;

public class Menu {
	
	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		System.out.println("\nCriar Contas\n");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "Joao da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maroa da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		
		while(true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + 
					"---------------------------------------------------------");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("                BANCO DO BRAZIL                          ");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("---------------------------------------------------------");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("              (1) Criar uma conta                        ");
			System.out.println("              (2) Listar todas as contas                 ");
			System.out.println("              (3) Buscar conta por numero                "); 
			System.out.println("              (4) Atualizar dados da conta               ");
			System.out.println("              (5) Apagar conta                           ");
			System.out.println("              (6) Sacar                                  ");
			System.out.println("              (7) Depositar                              ");
			System.out.println("              (8) Transferir valores entre contas        ");
			System.out.println("              (9) Sair                                   ");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("---------------------------------------------------------");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("Digite a opção que deseja:                               ");
			System.out.println("                                                         "+Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException inputMismatchException ) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0 ;
			}
				
			
			if(opcao == 9) {
				System.out.println();
				System.out.println("O Banco do Brazil agradece sua visita! - Seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar uma conta\n\n");
				
				System.out.println("Digite o número da agencia: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				do {
					System.out.println("Digite o tipo da conta (1-CC ou 2-CP):");
					tipo = leia.nextInt();
					
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o Saldo da conta (R$): ");
				saldo = leia.nextFloat();
				
				switch(tipo) {
					case 1 -> {
						System.out.println("Digite o limite de Crédito (R$): ");
						limite = leia.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do aniversario da conta: ");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas\n\n");
				contas.listarTodas();
				
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar conta por numero\n\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta\n\n");
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar conta\n\n");
				
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Sacar\n\n");
				
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depositar\n\n");
				
				keyPress();
				break;
			case 8: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferir valores entre contas");
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida!\n");
				keyPress();
				break;
			}		
		}
}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione ENTER para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de ENTER!");

		}
	}
}
 			
