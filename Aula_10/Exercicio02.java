package reset_aula_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {

			int[] idades = new int[10];
			for (int i = 0; i < idades.length; i++) {
				System.out.println("Digite a idade " + i);
				idades[i] = scan.nextInt();
			}
			System.out.println("--------");

			int maiorDeIdade = 0;
			for (int idade : idades) {
				if (idade >= 18) {
					maiorDeIdade++;
				}
			}

			System.out.println("Idades: ");
			for (int idade : idades) {
				System.out.println(idade);

			}

			System.out.println("--------");
			System.out.println("Quantidade de pessoas maiores de idade  = " + maiorDeIdade);

			scan.close();

		} catch (InputMismatchException imp) {
			System.out.println("Favor inserir apenas numeros " + imp);
		}

	}
}
