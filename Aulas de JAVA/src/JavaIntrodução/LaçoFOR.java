package JavaIntrodução;

import java.util.Scanner;

public class LaçoFOR {

	public static void main(String[] args) {
		
		String nome;
		float nota1,nota2,nota3,media,somamedia=0, mediageral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=3;x++) {
			System.out.println("Digite o nome do Aluno: ");
			nome = leia.nextLine();
			leia.nextLine();
			System.out.println("\nDigite a primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("\nDigite a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("\nDigite a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1+nota2+nota3)/3;
			
			somamedia += media;
			
			System.out.println("O aluno "+nome+"teve a média "+media);
			
		}mediageral = somamedia/3; 
		 System.out.println("A média geral da sala foi de "+somamedia+"");

	}

}
