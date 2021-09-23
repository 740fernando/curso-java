package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome==null) {
			throw new NullPointerException("Nome nao pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno)obj; //cast
		return this.nome.equals(outro.nome);
	}
	@Override
	public int hashCode() {
		//return this.nome.charAt(0);
		return this.nome.hashCode();
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aluno : "+this.nome+" , matricula :  "+
		this.numeroMatricula+" ] ";
	}
	/*
	 * Vamos à explicação: a estrutura Set usa uma tabela de espalhamento para realizar mais rapidamente
	 *  suas buscas. Imagine que cada vez que você adiciona algo dentro do seu Set para espalhar o
	 *  s objetos, um número mágico é gerado e todos os objetos que o tenham são agrupados. 
	 *  E ao buscar, em vez de comparar o objeto com todos os outros objetos contidos dentro do Set 
	 *  (isso daria muitas comparações), ele gera novamente o mesmo número mágico, e compara apenas 
	 *  com aqueles que também tiveram como resultado esse número. Ou seja, ele compara apenas dentro
	 *   do grupo de semelhança. No caso da matricula não reconhecida, o aluno a1 estava num grupo 
	 *   diferente de turini,   e por isso o método contains não conseguia encontrá-lo.
	 */
}


