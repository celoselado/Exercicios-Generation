package ExerciciosMATRIZ;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {


		float[][] notas = new float[10][4];
		float[] medias = new float[10];
		float[] soma = new float [10];
		int linha,coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<10;linha++) {
			for(coluna=0;coluna<4;coluna++) {
				System.out.println("Digite a nota: ");
				notas[linha][coluna] = leia.nextFloat();
			}
		}
		
		for(linha=0;linha<10;linha++) {
			for(coluna=0;coluna<4;coluna++) {
				
				soma[linha] += notas[linha][coluna];
				medias[linha] = soma[linha]/4;
			
				}
			}
			
		for(linha=0;linha<10;linha++) {
			System.out.printf("\nMédia: %.1f",medias[linha]);
		}
		
	}

}
