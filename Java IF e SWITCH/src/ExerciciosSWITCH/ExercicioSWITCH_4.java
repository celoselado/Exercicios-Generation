package ExerciciosSWITCH;

import java.util.Scanner;

public class ExercicioSWITCH_4 {

	public static void main(String[] args) {
		
		float saldo = 1000,deposito,saque,novosal;
		int acao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tMAQUINA BANCÁRIA");
		System.out.println("---------------------------------");
		System.out.println("\n1- VERIFICAR SALDO ");
		System.out.println("\n2- SAQUE ");
		System.out.println("\n3- DEPÓSITO ");
		System.out.println("---------------------------------");
		System.out.println("\nDigite a ação que deseja fazer: ");
		acao = leia.nextInt();
		
		switch(acao) {
		case 1:
			System.out.printf("\nO seu saldo é de R$ %.2f",saldo);
		break;
		case 2:
			System.out.println("\nDigite o valor que deseja sacar: ");
			saque = leia.nextFloat();
			if(saque < saldo && saque > 0) {
				novosal = saldo - saque;
				System.out.printf("\nSeu novo saldo é de R$ %.2f",novosal);
			}else {
				System.out.println("\nSaldo insuficiente ou o valor digitado é inválido.");
			}
		break;
		case 3:
			System.out.println("\nDigite o valor que deseja depositar: ");
			deposito = leia.nextFloat();
			novosal = saldo + deposito;
			System.out.printf("\nSeu novo saldo é de R$ %.2f",novosal);
		break;
			default:
				System.out.println("\nVocê digitou uma ação inválida.");
		}

	}

}
