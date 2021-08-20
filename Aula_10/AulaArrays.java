package reset_aula_10;

public class AulaArrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];
		temperaturas[0] = 35.5;
		temperaturas[1] = 36.5;
		temperaturas[2] = 37.5;
		temperaturas[3] = 38.5;
		temperaturas[4] = 39.5;

		// for (double temp : temperaturas) {
		// System.out.println(temp);
		// }

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 10;
		notasAlunos[0][2] = 10;
		notasAlunos[0][3] = 10;

		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 20;
		notasAlunos[1][2] = 10;
		notasAlunos[1][3] = 10;

		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 5;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 10;
		
		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota  + " ");
			}
			System.out.println();
		}

	}

}
