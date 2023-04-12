package JavaIntrodução;

import java.util.Scanner;

public class OláMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Lucas Vinicius";
		int idade = 26;
		double altura = 1.86,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nSeu nome é: "+nome);
		System.out.println("\nVoce tem "+idade+" de idade.");
		System.out.println("\nVoce tem "+altura+"m");
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota");
		nota3 = leia.nextDouble();
		 
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nSua média é de: "+media);
		System.out.printf("\nSua média é de: %.2f",media);
		
		
		
	}

}
