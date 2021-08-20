package reset_aula_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		try {
			int[] vetor1 = new int[5];
			for (int i = 0; i < vetor1.length; i++) {
				System.out.println("Posição " + i);
				System.out.println("---------");
				vetor1[i] = scan.nextInt();
				System.out.println("---------");
			}

			int[] vetor2 = new int[vetor1.length];
			for (int i = 0; i < vetor1.length; i++) {
				vetor2[i] = vetor1[i] * 2;
			}

			System.out.println("Valores do primeiro vetor");
			System.out.println();
			for (int vetor : vetor1) {
				System.out.println(vetor);
			}

			System.out.println("Valores do segundo vetor");
			System.out.println();
			for (int vetor : vetor2) {
				System.out.println(vetor);
			}

			scan.close();
			
		} catch (InputMismatchException imp) {
			System.out.println("Favor inserir apenas numeros " + imp);
		}
		
	}
}
