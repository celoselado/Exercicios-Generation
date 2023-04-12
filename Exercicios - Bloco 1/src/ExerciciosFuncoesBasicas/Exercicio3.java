package ExerciciosFuncoesBasicas;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salbrut,adicnot,horaext,desc,salaliq;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário bruto: ");
		salbrut = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicnot = leia.nextFloat();
		System.out.println("Digite o valor de hora extra: ");
		horaext = leia.nextFloat();
		System.out.println("Digite o valor a ser descontado: ");
		desc = leia.nextFloat();
		
		salaliq = salbrut + adicnot + (horaext * 5) - desc;
		
		System.out.printf("O salário líquido é de: %.2f",salaliq);
		
		

	}

}
