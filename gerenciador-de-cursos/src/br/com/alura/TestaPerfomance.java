package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {
	public static void main(String[] args) {

		Collection<Integer> numeros = new ArrayList<Integer>();

		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("ArrayList - Tempo gasto: " + tempoDeExecucao);

		System.out.println("==========================================================");

		Collection<Integer> numeros2 = new HashSet<Integer>();

		long inicio2 = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros2.add(i);
		}

		for (Integer numero : numeros) {
			numeros2.contains(numero);
		}

		long fim2 = System.currentTimeMillis();

		long tempoDeExecucao2 = fim2 - inicio2;

		System.out.println("HashSet - Tempo gasto: " + tempoDeExecucao2);

		System.out.println();
		System.out.println("No caso do ArrayList, a inserção é bem rápida e a busca muito lenta!\r\n"
				+ "No caso do HashSet, a inserção ainda é rápida,embora um pouco mais lenta do\n "
				+ "que a das listas. Mas a busca é muito rápida!");
	}

}
