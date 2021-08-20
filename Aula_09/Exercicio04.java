package reset_aula_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// caso usuario insina algum caractere inválido
		try {
			System.out.println("Informe um número ");
			int num = scan.nextInt();

			System.out.println("A tabuada do " + num);

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " X " + i + " = " + num * i);
			}

			scan.close();

		} catch (InputMismatchException imp) {
			System.out.println("Favor inserir apenas numeros " + imp);
		}

	}
}
