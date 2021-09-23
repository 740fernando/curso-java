package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		
		
		Curso javaColecoes = new Curso("Dominando as colecoes do java","Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",20));
		javaColecoes.adiciona(new Aula("Criando uma Aula",24));
		javaColecoes.adiciona(new Aula("Modelando com colecoes",24));
		
		List<Aula> aulasImutaveis= javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		//Collections.sort(aulas);// erro java.lang.UnsupportedOperationException  por causa unmodifiableList

		List <Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);//agora foi possivel executar o sort, porque foi criado uma copia do objeto,para ser manipulado
		System.out.println("-----------------------");				
		//System.out.println(aulas);
		System.out.println(javaColecoes);
		
	}
}
