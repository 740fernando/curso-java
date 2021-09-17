package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente fernando = new Cliente();
		fernando.nome = "Fernando Luiz";
		fernando.cpf = "38824769829";
		fernando.profissao="programador";
		
		Conta contaDoFernando = new Conta();
		contaDoFernando.deposita(100);
		
		contaDoFernando.titular=fernando;
		System.out.println(contaDoFernando.titular);
		
	}
}
