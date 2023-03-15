package ExerciciosIF;

import java.util.Scanner;

public class ExercicioIF_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a,b;

	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite um numero: ");
	a = leia.nextInt();
	
	b = a % 2;
	
	if(b==0 && a>0) {
		System.out.println("O numero "+a+" é par e positivo!");
	}else if(b==0  && a<0) {
		System.out.println("O numero "+a+" é par e negativo!");
	}else if(b!=0 && a<0) {
		System.out.println("O numero "+a+" é impar e negativo!");
	}else if(b!=0 && a>0) {
		System.out.println("O numero "+a+" é impar e positivo!");
	}

	
	}

}
