package ExerciciosVETOR;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int[] numero = new int[10];
		int x,numeroinserido,numeroprocurado,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n----------------------------------------");
		System.out.println("\tARMAZENADOR DE NUMEROS");
		
		for(x=0;x<10;x++) {
			
			System.out.println("-----------------------------------------");
			System.out.println("Digite um numero para ser armazenado: ");
			numero[x] = leia.nextInt();
			
		}
		System.out.println("\n-----------------------------------------");
		System.out.println("Qual número deseja encontrar? ");
		numeroinserido = leia.nextInt();
		
		for(x=0;x<10;x++) {
			if(numeroinserido == numero[x]) {
				System.out.println("\n-----------------------------------------");
				System.out.println("O numero inserido está alocado na posição "+x);
				System.out.println("\n-----------------------------------------");
				cont++;
			}
		}
		
		if(cont == 0) {
			System.out.println("\n-----------------------------------------");
			System.out.println("O numero inserido não foi alocado!");
			System.out.println("-----------------------------------------");
		}
		
		

	}

}
