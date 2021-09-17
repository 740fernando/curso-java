// Gerente eh um funcionario, gerente herda da class funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel{ //herdar == extends implements= assina contrato com a interface

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador= new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("MÉTODO GERENTE");
		return super.getSalario();// super indica que o atributo é da classe mae
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}	
}
