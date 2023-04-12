package ExerciciosDeReforço;

import java.util.Scanner;

public class Exercicio2 {

	
	/*
	 * Escreve um programa que lê duas matrizes N1 (3,2) e N2(3,2) e cria:
       a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
       b) Uma matriz M2 cujos elementos serão as subtrações dos elementos de mesma posição das matrizes N1 e N2.

	 */
	
	public static void main(String[] args) {

		float[][] matriz1 = new float[3][2];
		float[][] matriz2 = new float[3][2];
		float[][] somatriz = new float[3][2];
		float[][] submatriz = new float[3][2];
		int linha,coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("Digite o numero que será atribuido na linha "+linha+" na coluna "+coluna+" da primeira matriz!");
				matriz1[linha][coluna] = leia.nextFloat();

			}
		}
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("Digite o numero que sera atribuido na linha "+linha+" na coluna "+coluna+" da segunda matriz!");
				matriz2[linha][coluna] = leia.nextFloat();
					
			}
				 
		}
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				somatriz[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
			}
		}
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				submatriz[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
			}
		}
		
		System.out.println("--------------------------------");
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println(somatriz[linha][coluna]);
			}
		}
		
		System.out.println("--------------------------------");
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println(submatriz[linha][coluna]);
			}
		}
		
	}

}
