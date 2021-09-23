package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;


public class TestandoListas {
	public static void main(String[] args) {


		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);//Adicionando elementos em uma lista
		aulas.add(aula2);
		aulas.add(aula3);        

		System.out.println("O primeiro curso da lista eh o: "+ aulas.get(0)); 
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		
		
		aulas.remove(0); //Removendo elementos

		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);        
	}
}




