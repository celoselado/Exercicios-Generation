package JavaIntrodução;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
	
		int[][] numero = new int [3][3];
		int somamatriz=0, linha,coluna, somadiagonal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("----------------------");
				System.out.println("Digite um numero: ");
				numero[linha][coluna] = leia.nextInt();
				
				somamatriz += numero[linha][coluna];
				
				if(linha == coluna) {
					somadiagonal += numero[linha][coluna];
					
				}
				
				
			}
			
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("A soma de todos os numeros na matriz foi de: "+somamatriz);
		System.out.println("E a soma dos numeros que estão na diagonal foi de: "+somadiagonal);
		System.out.println("-----------------------------------------------------");

	}

}
