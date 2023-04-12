package ExerciciosFuncoesBasicas;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario,abono,novosal;
		
		System.out.println("Digite o seu salário: ");
		
		Scanner leia = new Scanner(System.in);
		
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		
		abono = leia.nextFloat();
		
		novosal = salario + abono;
		
		System.out.println("Seu novo salário é de: "+novosal);
				
		
		
				
		
		
		
		
		
		
		
	}

}
