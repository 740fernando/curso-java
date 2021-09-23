package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes= new Curso("Dominando as colecões do Java",
				"Paulo Silveira");
		

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",21));
		javaColecoes.adiciona(new Aula("Modelando com colecoes",22));
		
		Aluno a1 = new Aluno("Rodrigo Turini",34672);
		Aluno a2 = new Aluno("Gulherme Silveira",5617);
		Aluno a3 = new Aluno("Jose William", 17645);
		Aluno a4 = new Aluno("Fernando Luiz", 5617);
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println("Quem é o aluno com matricula 5617:");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("aluno "+ aluno);
		 
	}

}
