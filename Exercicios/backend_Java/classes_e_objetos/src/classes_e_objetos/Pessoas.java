package classes_e_objetos;

public class Pessoas {

	String nomeCompleto;
	String endereco;
	String dataAdmissao;
	String dataDemissao;
	String email;
	int cpf;
	String setor;
	double salario;

	public void criaFuncionario(String endereco, String nomeCompleto, String dataAdmissao, String dataDemissao, int cpf,
			String email, String setor, String tipoFuncionario) {
		this.nomeCompleto = nomeCompleto;
		this.endereco = endereco;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.email = email;
		this.cpf = cpf;
		this.setor = setor;

		if (tipoFuncionario == "Gerente" || tipoFuncionario == "Supervisores") {
			System.out.println("Você foi cadastrado como pessoa Fisica.");
		}

	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHolerite() {
		return salario;
	}

	public double getBonificacaoGerente() {
		return this.salario * 0.12;
	}

	public double getBonificacaoSupervisor() {
		return this.salario * 0.08;
	}

	public void tiraFerias(int qtdMeses) {
		if (qtdMeses >= 11) {
			System.out.println("Pode tirar férias!");
		} else {
			System.out.println("Não pode tirar férias!");
		}
	}

}
