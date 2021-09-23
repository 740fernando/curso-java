package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("a");
		alunos.add("b");
		alunos.add("c");
		alunos.add("d");
		alunos.add("e");
		alunos.add("f");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for(String aluno : alunos) {
			System.out.println(aluno+" ");
			
		}
		
		System.out.println("========================");
		alunos.forEach(aluno ->{System.out.print(aluno);});
		System.out.println("=======================");
		System.out.println(alunos);
		System.out.println("============");
		List<String>alunosEmLista= new ArrayList<>(alunos);
	}
}
