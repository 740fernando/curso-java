
//contrato autenticavel
// quem assinar esse contrato, precisa implmentar
	// metodo senha
	// metodo autentica
public abstract interface Autenticavel { // interface só tem métodos, nada concreto
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
