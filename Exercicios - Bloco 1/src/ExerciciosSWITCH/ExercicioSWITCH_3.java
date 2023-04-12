package ExerciciosSWITCH;

import java.util.Scanner;

public class ExercicioSWITCH_3 {

	public static void main(String[] args) {
		
		float num1,num2,result;
		int operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tMENU DE OPERAÇÕES");
		System.out.println("---------------------------------");
		System.out.println("\n1- +SOMA+ ");
		System.out.println("\n2- -SUBTRAÇÃO-");
		System.out.println("\n3- xMULTIPLICAÇÃOx");
		System.out.println("\n4- %DIVISÃO%");
		System.out.println("---------------------------------");
		System.out.println("\nDigite qual você irá utilizar: ");
		operacao = leia.nextInt();
		System.out.println("---------------------------------");
		
		System.out.println("\nDigite o primeiro valor: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o segundo valor: ");
		num2 = leia.nextFloat();
		
		switch(operacao) {
		case 1:
			result = num1 + num2;
			System.out.println("\n"+num1+" + "+num2+" = "+result);
		break;
		case 2:
			result = num1 - num2;
			System.out.println("\n"+num1+" - "+num2+" = "+result);
		break;
		case 3:
			result = num1 * num2;
			System.out.println("\n"+num1+" X "+num2+" = "+result);
		break;
		case 4:
			result = num1 / num2;
			System.out.println("\n"+num1+" % "+num2+" = "+result);
		break;
		default:
			System.out.println("Operação selecionada INVALIDA.");
		}
		

	}

}
