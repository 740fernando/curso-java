
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
	
		System.out.println(conta.getNumero());
		
		Cliente fernando= new Cliente();
		//conta.titular = fernando; error
		fernando.setNome("Fernando Luiz");
		
		conta.setTitular(fernando);
		
		System.out.println(conta.getTitular().getNome());// exibe o nome do titular
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(fernando);
		System.out.println(conta.getTitular());
	}	
}
