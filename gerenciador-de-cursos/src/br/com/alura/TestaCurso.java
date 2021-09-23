package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes= new Curso("Dominando as colecões do Java",
				"Paulo Silveira");
		
		/* Logo abaixo, foi criado um objeto aulas no main, para manipular o  do Objeto Curso -MA PRATICA
		 * List<Aula> aulas = javaColecoes.getAulas(); 
		 * aulas.add(new Aula("Trabalhando com ArrayList",21));
		 *  System.out.println(aulas);
		 * System.out.println("======================");
		 * System.out.println("getAulas : "+javaColecoes.getAulas());
		 * Outra ma pratica
		 * javaColecoes.getAulas().add(New Aula("Trabalhando com ArrayList",21)
		 */	
	
		 // A linha abaixo resumi todo o codigo acima
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21)); obriga a utilizar o coidgo abaixo, apos o unmodifiableList
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("\nCriando uma Aula",21));
		javaColecoes.adiciona(new Aula("\nModelando com colecoes",22));
		
		System.out.println(javaColecoes.getAulas());
		
	}
}
