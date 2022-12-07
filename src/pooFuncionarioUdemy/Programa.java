package pooFuncionarioUdemy;

import java.util.*;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira a quantidade de funcionários que serão inseridos: ");
		int n = input.nextInt();
		List<Funcionario> lista = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Insira a id do funcionário: ");
			int id = input.nextInt();
			System.out.print("Insira o nome do funcionário: ");
			String nome = input.next();
			System.out.print("Insira o salário do funcionário: ");
			double salario = input.nextDouble();

			Funcionario func = new Funcionario(id, nome, salario);

			lista.add(func);
		}

		System.out.println("------------------");
		System.out.println("Entre com a id do funcionário que deseja alterar o salário: ");
		int idsalario = input.nextInt();
		Integer pos = position(lista, idsalario);
		if (pos == null) {
			System.out.println("O id inserido não existe.");
		} else {
			System.out.println("Insira a porcentagem que deseja alterar: ");
			double porcento = input.nextDouble();
			lista.get(pos).aumentoSalario(porcento);
		}

		System.out.println();
		System.out.println("Lista de Funcionários inseridos: ");
		;
		for (Funcionario func : lista) {
			System.out.println(func);
		}

		input.close();
	}

	public static Integer position(List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
