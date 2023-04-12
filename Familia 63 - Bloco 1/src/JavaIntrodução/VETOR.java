package JavaIntrodução;

import java.util.Scanner;

public class VETOR {

	public static void main(String[] args) {


		float [] media = new float [3];
		float n1,n2,n3,somamedia=0,mediageral=0;
		int x;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("----------------------");
		for(x=0;x<3;x++) {
			System.out.println("\nDigite a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("Digite a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("Digite a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			
			somamedia += media[x];
			
			if(media[x]>=7 && media[x]<=10) {
				System.out.println("----------------------");
				System.out.println("Aluno aprovado!");
				System.out.println("----------------------");
			}else if(media[x]>=5 && media[x]<7) {
				System.out.println("----------------------");
				System.out.println("Aluno de recuperação.");
				System.out.println("----------------------");
			}else {
				System.out.println("Aluno reprovado. ");
			}
			
		}
		
		mediageral = somamedia/3;
		System.out.println("A soma de todas as médias da sala foi de: "+somamedia);
		System.out.println("A média geral de todos da turma foi de: "+mediageral);
		System.out.println("--------------------------------------------");

	}

}
