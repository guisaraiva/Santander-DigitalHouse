package heranca_encaps_abstracao;

public class Telefonista extends Funcionario{
	
	private int estacaoDeTrabalho;

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
	
	@Override //Sobrescrita do m�todo principal da classe Funcion�rios
	public double calculaBonificacao() {
		return this.getSalario() * 0.5 + 200;
	}

}
