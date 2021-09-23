package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

     //O ArrayList() será nosso guardador de referências, ao ser executado, internamente, 
	//ele utiliza um array com um número pré-determinado de posições, que gira em torno de 1000.
		ArrayList<Conta> lista= new ArrayList<Conta>();
		
		/*
		 * Estes símbolos que utilizamos (<>) se chamam generics. Temos uma classe, 
		 * ela é genérica, mas ao utilizá-la, podemos tipificar o que ela conterá, 
		 * por exemplo, String:
		 */
		ArrayList<String> nomes = new ArrayList<String>();
		
	
				
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho = "+lista.size());//mostra quantas referencias foram armazenadas
		
		/*
		 * Podemos também criar um método para que seja exibido um dos elementos do array. 
		 * Para isso, temos o get(index), onde podemos passar a posição desejada entre parênteses (()).
		   Nosso retorno será do tipo Object, já que temos um array de referências genéricas.
		 */
			
			Conta ref =  lista.get(0);// gerenerica para espcifica vai funcionar
			System.out.println(ref.getNumero());
			
			System.out.println("Ref = "+ref);
			lista.remove(0);

            System.out.println("Tamanho: " + lista.size());
            
            Conta cc3 = new ContaCorrente(33, 311);
            lista.add(cc3);

            Conta cc4 = new ContaCorrente(33, 322);
            lista.add(cc4);
            
            for(int i = 0; i < lista.size(); i++) {
                Object oRef = lista.get(i);
                System.out.println(oRef);
            }
            System.out.println("-------");
            for(Conta conta : lista) {
                System.out.println(conta);
            }
	}

}
