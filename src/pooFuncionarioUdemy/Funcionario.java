package pooFuncionarioUdemy;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario() {	
	}
	

	public Funcionario (int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentoSalario( double porcentagem){
		this.salario += salario * porcentagem / 100;
	}
	
	public void exibe() {
		 System.out.println("Id: " + id);
		 System.out.println("Nome: " + nome);
		 System.out.println("Salário R$ " + salario);
	}
	
	@Override
	public String toString() {
		return "Funcionario [id = " + id + ", nome = " + nome + ", salario = " + salario + "]";
	}
	

}
