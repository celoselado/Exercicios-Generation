package ExerciciosSWITCH;

import java.util.Scanner;

public class ExercicioSWITCH_2 {

	public static void main(String[] args) {
		
		String nome;
		float salario,novosal;
		int cargo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tMENU DE CARGOS");
		System.out.println("---------------------------------");
		System.out.println("\n1- GERENTE - 10% DE REAJUSTE ");
		System.out.println("\n2- VENDEDOR - 7% DE REAJUSTE ");
		System.out.println("\n3- SUPERVISOR - 9% DE REAJUSTE ");
		System.out.println("\n4- MOTORISTA - 6% DE REAJUSTE ");
		System.out.println("\n2- ESTOQUISTA - 5% DE REAJUSTE ");
		System.out.println("\n3- TECNICO DE TI - 8% DE REAJUSTE ");
		System.out.println("---------------------------------");
		System.out.println("\nDigite o nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("Digite o código do cargo: ");
		cargo = leia.nextInt();
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1:
			novosal = salario + ((10 * salario)/100);
			System.out.printf("O colaborador "+nome+" que exerce o cargo de Gerente, recebe R$ %.2f",novosal);
		break;
		case 2:
			novosal = salario + ((7 * salario)/100);
			System.out.printf("O colaborador "+nome+" que exerce o cargo de Vendedor, recebe R$ %.2f",novosal);
		break;
		case 3:
			novosal = salario + ((9 * salario)/100);
			System.out.printf("O colaborador "+nome+" que exerce o cargo de Supervisor, recebe R$ %.2f",novosal);
		break;
		case 4:
			novosal = salario + ((6 * salario)/100);
			System.out.printf("O colaborador "+nome+" que exerce o cargo de Motorista, recebe R$ %.2f",novosal);
		break;
		case 5:
			novosal = salario + ((5 * salario)/100);
			System.out.printf("O colaborador "+nome+" que exerce o cargo de Estoquista, recebe R$ %.2f",novosal);
		break;
		case 6:
			novosal = salario + ((8 * salario)/100);
			System.out.printf("O colaborador "+nome+" que exerce o cargo de Técnico de TI, recebe R$ %.2f",novosal);
		break;
		default:
			System.out.println("O código de cargo seletionado é inválido.");
		}
		
		
	}

}
