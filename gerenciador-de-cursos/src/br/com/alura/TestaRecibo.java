package br.com.alura;

import java.util.TreeSet;

public class TestaRecibo {
	
	public static void main(String[] args) {
		
		Recibo rec1= new Recibo(15,2.5);
		
		Recibo rec2= new Recibo(2,3.4);
		
		Recibo rec3 = new Recibo(3,5.6);
		
		TreeSet<Recibo> listaRecibo = new TreeSet<>();
		
		listaRecibo.add(rec1);
		listaRecibo.add(rec2);
		listaRecibo.add(rec3);
		
		listaRecibo.forEach(recibo->{System.out.println(recibo);});
		
	}
}
