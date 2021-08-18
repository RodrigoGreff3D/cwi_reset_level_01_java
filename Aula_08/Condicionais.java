package reset_aula_08;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva o valor do item");
		double valorItem = scan.nextDouble();

		if (valorItem <= 10) {
			System.out.println("é barato");
		} else if (valorItem > 10 && valorItem < 15) {
			System.out.println("Pedir desconto");
		} else if (valorItem >= 15 && valorItem < 17) {
			System.out.println("Pesquisar mais ");
		}else {
			System.out.println("Muito caro");
		}
		
		scan.close();
	}
	
}
