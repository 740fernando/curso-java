package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		Map<String,Integer> nomesParaIdade= new HashMap<>();
		
		nomesParaIdade.put("Paulo",31);// put == add
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		nomesParaIdade.keySet().forEach(a->{System.out.println("keySet : "+a);});
		System.out.println("===============================================================================================");
		nomesParaIdade.values().forEach(a->{System.out.println("values : "+a);});
		System.out.println("===============================================================================================");
		System.out.println("Para tal, existe o método entrySet() e cada associação é representado através da classe Entry:");
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
		for (Entry<String, Integer> associacao : associacoes) {
		    System.out.println("Set<Entry<String, Integer>> "+associacao.getKey() + " - " + associacao.getValue());
		}

	}

}
