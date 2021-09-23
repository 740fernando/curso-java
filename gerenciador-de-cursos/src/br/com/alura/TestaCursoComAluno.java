package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		
		Curso javaColecoes= new Curso("Dominando as colecões do Java",
				"Paulo Silveira");
		
	
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",21));
		javaColecoes.adiciona(new Aula("Modelando com colecoes",22));
		
		Aluno a1 = new Aluno("Rodrigo Turini",24672);
		Aluno a2 = new Aluno("Gulherme Silveira",32454);
		Aluno a3 = new Aluno("Jose William", 12342);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a->{
			System.out.println(a);
		});
		
		Set<Aluno> alunos= javaColecoes.getAlunos();
		Iterator<Aluno> iterador =alunos.iterator();
		while(iterador.hasNext()){// enquanto o iterador tiver um proximo elemento
			Aluno proximo = iterador.next();//devolve um aluno
			System.out.println(proximo);
		}
		/*
		 * for(Aluno a : javaColecoes.getAlunos()) { System.out.println(a); }
		 */
		
		System.out.println("O aluno "+a1+" esta matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno a4= new Aluno("Rodrigo Turini",24672);
		
		System.out.println("O aluno esta matriculado? "+a4);
		System.out.println(javaColecoes.estaMatriculado(a4));
		
		System.out.println("O a1 é equals a4 : ");
		System.out.println(a1.equals(a4));
		
		// obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode()==a4.hashCode());
		
		System.out.println(javaColecoes);
	}
}
