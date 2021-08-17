package cwi_reset.scanner.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cwi_reset.scanner.model.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		dadosPessoa();
	}

	public static void dadosPessoa() {

		Scanner scan = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

		int opcao = 0;

		do {
			
			System.out.println("## Escolha uma das op��es abaixo ##");
			System.out.println("Op��o 1 - Cadastra Pessoa");
			System.out.println("Op��o 2 - Imprime pessoa cadastrada");
			System.out.println("Op��o 0 - Sair do programa");
			System.out.println("---------------------------");

			System.out.println("Digite aqui sua op��o ");

			opcao = Integer.parseInt(scan.nextLine());

			if (opcao == 1) {

				pessoa = new Pessoa();

				System.out.println("Digite o c�digo: ");
				pessoa.setCodigo(Integer.parseInt(scan.nextLine()));

				System.out.println("Digite o nome: ");
				pessoa.setNome(scan.nextLine());

				System.out.println("Digite o endere�o: ");
				pessoa.setEndereco(scan.nextLine());

				System.out.println("Digite a idade: ");
				pessoa.setIdade(Integer.parseInt(scan.nextLine()));

				System.out.println();

				listaPessoas.add(pessoa);

			} else if (opcao == 2) {
				if (listaPessoas.isEmpty()) {
					System.out.println("N�o existe pessoas cadastradas, pressione uma tecla pra continuar");
					scan.nextLine();
				} else {
					System.out.println(listaPessoas.toString());

					System.out.println("Pressione uma tecla pra continuar");
					scan.nextLine();
				}
			}
		} while (opcao != 0);

		scan.close();

	}
}
