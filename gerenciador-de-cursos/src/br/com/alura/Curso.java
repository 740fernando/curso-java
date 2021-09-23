package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno= new LinkedHashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
		// metodo unmodifiableList= programar defensivamente, fazendo com que o método
		// getAulas
		// devolva uma cópia da coleção de aulas. Melhor ainda: podemos devolver essa
		// cópia de
		// tal forma que ela não possa ser alterada, ou seja, que ela seja não
		// modificável,
		// usando o método.
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		/*
		 * codigo acima representado abaixo. int tempoTotal = 0; for(Aula aula : aulas){
		 * tempoTotal+= aula.getTempo(): } return tempoTotal; } }
		 */
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Curso : " + nome);
		sb.append("  Tempo total: " + this.getTempoTotal());
		sb.append("\n=================================================================================================================================================================");
		for (Aula aula : aulas) {
			sb.append("\n"+this.aulas+"\n");
		}
		return sb.toString();
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(),aluno);//metodo put para relacionar uma chave (numero de matricula)a um objeto

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}	
		return matriculaParaAluno.get(numero);				
		/* apos implementar o "Map", fica desnecessario o codigo abaixo
		 * for(Aluno aluno : alunos) if(aluno.getNumeroMatricula()==numero) { return
		 * aluno; } throw new
		 * NoSuchElementException("matricula nao encontrada : "+numero);
		 */
	}
}