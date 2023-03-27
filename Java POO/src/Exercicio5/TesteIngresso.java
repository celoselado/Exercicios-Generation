package Exercicio5;

public class TesteIngresso {

	public static void main(String[] args) {

		Ingresso evento1 = new Ingresso("LollaPalooza",1200,"25/03/2023","Melanie Martinez, Kali Uchis e mais!",16);
		Ingresso evento2 = new Ingresso("Rock in Rio",1100,"18/08/2023","My Chemical Romance, Mitsuki e mais!",19);
		Vip evento3 = new Vip("Lolla",1200,"24/03/2023","Mxmtoon, Aurora e mais!",16,10);
		Meia evento4 = new Meia("Rock in Rio",1100,"25/09/2023","Luan Santana, Fred Mercury e mais!",19,"Estudantes");
		
		System.out.println();
		evento1.imprimir();
		System.out.println("******************************************************************");
		evento2.imprimir();
		System.out.println("******************************************************************");
		evento3.imprimir();
		System.out.println("******************************************************************");
		evento4.imprimir();

	}

}
