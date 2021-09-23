package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestandoIterator {
	public static void main(String[] args) {

		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		/*
		 * letras.forEach(letra -> {
    		System.out.println(letra);
			});
		 */
		Iterator<String> iterator = letras.iterator() ;
		while(iterator.hasNext()) {
			String proximo=iterator.next();
			System.out.print(proximo);
		}
	}
}

