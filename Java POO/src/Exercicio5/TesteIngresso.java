package Exercicio5;

public class TesteIngresso {

	public static void main(String[] args) {

		Ingresso evento1 = new Ingresso("LollaPalooza",1200,"25/03/2023","Melanie Martinez, Kali Uchis e mais!",16);
		Ingresso evento2 = new Ingresso("Rock in Rio",1100,"18/08/2023","My Chemical Romance, Mitsuki e mais!",19);
		
		System.out.println();
		evento1.imprimir();
		System.out.println("******************************************************************");
		evento2.imprimir();

	}

}
