package ExerciciosWHILE;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		char resp='S';
		int idade,sexo,categ,dbe=0,dmfe=0,dhm=0,dmfs=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(resp != 'N') {
			System.out.println("---------------------------");
			System.out.println("Digite a Idade: ");
			idade = leia.nextInt();
			System.out.println("---------------------------");
			System.out.println("Digite o Sexo: ");
			System.out.println("1- Masculino\n2- Feminino\n3- Outro");
			System.out.println("---------------------------");
			sexo = leia.nextInt();
			System.out.println("---------------------------");
			System.out.println("Digite a categoria:");
			System.out.println("1- BackEnd\n2- FrontEnd\n3- Mobile\n4- FullStack");
			System.out.println("---------------------------");
			categ = leia.nextInt();
			
			if(categ==1) {
				dbe++;
			}else if(sexo==2 && categ==2) {
				dmfe++;
			}else if(idade>=40 && sexo==1 && categ ==3) {
				dhm++;
			}else if(idade<=30 && sexo==2 && categ==4) {
				dmfs++;
			}
			
			System.out.println("----------------------------------------------");
			System.out.println("Deseja inserir um novo colaborador? (S/N)");
			System.out.println("----------------------------------------------");
			resp = leia.next().charAt(0);
			
		}System.out.println("--------------------------------------------------------------------------------");
		 System.out.println("O número de pessoas desenvolvedoras BackEnd é de: "+dbe);
		 System.out.println("O número de mulheres desenvolvedoras FrontEnd é de: "+dmfe);
		 System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos é de: "+dhm);
		 System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos é de: "+dmfs);
		 System.out.println("--------------------------------------------------------------------------------");
		

	}

}
