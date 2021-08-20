package reset_aula_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero de 1 a 10");

		boolean notaValida = false;

		// caso usuario insina algum caractere inválido

		try {
			do {
				double nota = scan.nextDouble();
				if (nota >= 0 && nota <= 10) {
					notaValida = true;
					System.out.println("Nota válida " + nota);
				} else {
					System.out.println("Nota invalida, digite um valor entra 1 e 10");
				}
			} while (notaValida = true);

			scan.close();

		} catch (InputMismatchException imp) {
			System.out.println("Favor inserir apenas numeros " + imp);
		}

	}

}
