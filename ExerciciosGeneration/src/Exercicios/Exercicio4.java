package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2,n3,n4,dif;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("Insira o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("Insira o terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.println("Insira o quarto valor: ");
		n4 = leia.nextFloat();
		
		dif = (n1 * n2) - (n3 * n4);
		
		System.out.printf("O valor referente a diferença é dê: %.2f",dif);
			
		
	}

}
