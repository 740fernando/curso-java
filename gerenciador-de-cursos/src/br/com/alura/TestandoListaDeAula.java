package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {
	
	public static void main(String[] args) {
		
		
		Aula a1 = new Aula("Revisando ArraysList",24);
		Aula a2 = new Aula("Listas de objetos",20);
		Aula a3 = new Aula("Relacionamento de listas e objetos",15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas,Comparator.comparing(Aula::getTempo)); // ordenar pelo menor tempo
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo)); // ordenar pelo menor tempo
		
		/*
		 * String s1 = "Fernando"; String s2 = "Luiz";
		 * 
		 * System.out.println(s1.compareTo(s2));
		 */
		System.out.println(aulas);
		
		
		
	}

}
