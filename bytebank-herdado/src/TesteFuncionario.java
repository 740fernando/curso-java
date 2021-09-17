
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Autenticavel cliente = new Cliente();
		
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("22233355656-9");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario=300.0;
		
	}

}
