package reset_aula_08;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		
		calculaMedia();
	}

	
	//Método para cálculo de média
	public static void calculaMedia() {
		
		Scanner scan = new Scanner(System.in); 

		System.out.println("Informe a primeira nota");
		double primeiraNota = scan.nextDouble();
		
		System.out.println("Informe a segunda nota");
		double segundaNota = scan.nextDouble();

		System.out.println("Informe a terceira nota");
		double terceiraNota = scan.nextDouble();

		System.out.println("Informe a quarta nota");
		double quartaNota = scan.nextDouble();

		double mediaAluno = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		
		if (mediaAluno == 10) {
			System.out.println("Aluno aprovado com louvores");
		} else if (mediaAluno >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
	}

		
		
	}

