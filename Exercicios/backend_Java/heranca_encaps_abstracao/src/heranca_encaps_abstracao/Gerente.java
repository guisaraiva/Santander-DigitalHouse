package heranca_encaps_abstracao;

public class Gerente extends Funcionario{
	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override //sobreescrevendo o método da superclasse Funcionario
	public double calculaBonificacao() {
		return this.getSalario() * 0.6 + 100;
		}
}
