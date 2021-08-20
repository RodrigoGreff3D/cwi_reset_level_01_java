package reset_aula_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		

		// caso usuario insina algum caractere inválido
		try {
			System.out.println("Digite o primeiro numero");
			int primeiroNumero = scan.nextInt();

			boolean maiorQuePrimeiro = false;
			int ultimoNumero = 0;

			do {
				System.out.println("Informe o ultimo numero ");
				ultimoNumero = scan.nextInt();

				if (primeiroNumero < ultimoNumero) {
					maiorQuePrimeiro = true;
				} else {
					System.out.println("Informe um numero maior que o primeiro");
				}

			} while (!maiorQuePrimeiro);

			for (int i = primeiroNumero; i < ultimoNumero; i++) {
				if (i % 2 == 0) {
					System.out.println("Numeros no intervalo " + i);

				}

			}

			scan.close();

		} catch (InputMismatchException imp) {
			System.out.println("Favor inserir apenas numeros " + imp);
		}

	}
}
