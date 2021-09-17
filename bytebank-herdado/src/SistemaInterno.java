
public class SistemaInterno {

	private int senha = 2222; // senha do sistema interno. O gerente saber da senha para poder etnrerar

	public void autentica(Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		}else {
			System.out.println("Não pode entrar no sistema");
		}

	}
}