package heranca_encaps_abstracao;

public class Funcionario {
	/*
	 * o acesso dos atributos ou m�todos de uma superclasse 
	 * � permitido somente se est�o definidos com o modo de visibilidade como public ou protected.
	 * **/
	private double salario;
	private String nome;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calculaBonificacao() {
		return this.salario * 0.1;
	}
	

}
