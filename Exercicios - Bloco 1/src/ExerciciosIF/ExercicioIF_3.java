package ExerciciosIF;

import java.util.Scanner;

public class ExercicioIF_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		boolean resp;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		System.out.println("Você já doou sangue? ");
		resp = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 60) {
			System.out.println(nome+", você está apto para doar sangue!");
		}else if(idade > 60 && idade <= 69 && resp == true) {
			System.out.println(nome+", você está não está apto para doar sangue!");
		}else if( idade > 60 && idade <= 69 && resp == false) {
			System.out.println(nome+", você está apto para doar sangue!");
		}else {
			System.out.println(nome+"\nVoce não esta apto para doar sangue!");
		}

	}

}