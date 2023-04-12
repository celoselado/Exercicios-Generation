package ExerciciosDeReforço;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		float[][] matriz = new float [3][3];
		float resuldiag=0,resultadosoma=0;
		int linha,coluna;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("Preencha a matriz: ");
		System.out.println("--------------------");
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("Digite o numero que estara na linha "+linha+" dentro da coluna "+coluna);
				matriz[linha][coluna] = leia.nextFloat();
				System.out.println("----------------------------------------------------");
				resultadosoma += matriz[linha][coluna];
				
			}
		}
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				if(linha == coluna) {
					resuldiag += matriz[linha][coluna];
				}
			}
		}
		
		System.out.println("O resultado da soma de todos os numeros inseridos na matriz foi de: "+resultadosoma);
		System.out.println("O resultado da soma dos numeros da diagonal foi de: "+resuldiag);
	}

}
