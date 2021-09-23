package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		//1) adicione alguns alunos
		alunos.add("Fernando");
		alunos.add("Lauren");
		alunos.add("Fernanda");
		alunos.add("Luan");

		//2) imprima o tamanho da colecao
		System.out.println(alunos.size());

		//3) tente adicionar um aluno que existe
		alunos.add("Fernando");
		//4) imprima novamente o tamanho da colecao
		System.out.println(alunos.size());
		//5)O método add devolve um booleano que indica o sucesso:
		boolean adicionou = alunos.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
		
		//6)exibe as informacoes 
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}