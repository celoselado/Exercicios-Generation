package ExerciciosWHILE;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int idade=1,mdvu=0,mdc=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println(" PARA CANCELAR, DIGITE -1");
		System.out.println("---------------------------");
		
		while(idade>=1) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
			if(idade<=21 && idade>0) {
				mdvu++;
				
			}else if(idade>=50){
				mdc++;
				
			}
		}System.out.println("------------------------");
		 System.out.println("O total de pessoas de/com menos de 21 anos é: "+mdvu);
		 System.out.println("O total de pessoas de/com mais de 50 anos é de: "+mdc);
	}

}
