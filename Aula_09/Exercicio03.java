package reset_aula_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int maior = 0;

		// caso usuario insina algum caractere inválido
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Digite um numero: ");
				numero = scan.nextInt();

				if (numero > maior) {
					maior = numero;
				}
			}
			System.out.println(maior);
			scan.close();
		} catch (InputMismatchException imp) {
			System.out.println("Favor inserir apenas numeros " + imp);
		}

	}
}
