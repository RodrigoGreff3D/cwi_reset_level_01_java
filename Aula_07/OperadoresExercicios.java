package reset_aula_07;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresExercicios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		// somaDoisNumeros();
		//calculaMedia();
		//totalSalarioMes();
	}

	/*Método para somar dois numeros*/
	public static void somaDoisNumeros() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro numero");
		int numero1 = scan.nextInt();

		System.out.println("Informe o segundo numero");
		int numero2 = scan.nextInt();

		int soma = numero1 + numero2;

		System.out.println("A soma dos numeros é " + soma);

		scan.close();
	}

	/*Método para calcular média*/
	public static void calculaMedia() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a nota 1:");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a nota 2:");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota 3:");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota 4:");
		double nota4 = scan.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("A média é %.2f%n",media);

		scan.close();
	}
	
	/*Método para calcular salário baseado no valor e numero de horas trabalhadas*/
	public static void totalSalarioMes() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Numero de horas trabalhadas mes:");
		double horasTrabalhadas = scan.nextDouble();
		
		double totalMes = valorHora * horasTrabalhadas;
		
		System.out.printf("O salario total do mes foi: R$ %.2f%n", totalMes);
		
		
	}

}
