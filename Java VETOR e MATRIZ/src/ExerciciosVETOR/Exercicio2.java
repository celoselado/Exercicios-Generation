package ExerciciosVETOR;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 int [] numero = new int[10];
		 int x,soma=0;
		 float media;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("-----------------------------------------");
		 
		 for(x=0;x<10;x++) {
			 System.out.println("Digite um numero: ");
			 numero[x] = leia.nextInt();
			 
			 soma += numero[x];
		 }
		 
		 System.out.print("\n----------------------------------------------------------");
		 
		 System.out.print("\nOs numeros impares inseridos foram os: ");
		 for(x=0;x<10;x++) {
			 if(numero[x] % 2 != 0) {
				 System.out.print(numero[x]+", ");
			}
		}
		
		 System.out.print("\nOs numeros pares inseridos foram os: ");
		 for(x=0;x<10;x++) {
			 if(numero[x] % 2 == 0) { 
				 System.out.print(numero[x]+", ");
			 }
		 }
		 
		 System.out.println("\nA soma de todos os valores foi de: "+soma);
		 media = soma/10; //perguntar o motivo da media estar saindo arredondada.
		 System.out.println("E a média foi de: "+media);
		 System.out.println("----------------------------------------------------------");
		 }

}
