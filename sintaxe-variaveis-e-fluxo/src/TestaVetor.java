
public class TestaVetor {
	public static void main(String[] args) {
		int n[] = {40,30,20,10};
		System.out.println("O total de casas de N é : "+n.length);
		System.out.println();
		System.out.println("Teste Lenght");
		System.out.println();
		for (int i = 0; i < n.length-1; i++) {
			System.out.println("Na posição "+i+" temos o valor : "+n[i]+" ");
		}
		System.out.println("");
		System.out.println("Teste 'For'");
		System.out.println("");
		for(int i = 0 ; i<4;i++) {
			System.out.println("Na posição "+i+" temos o valor : "+n[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Teste 'For each' ");


		for (int i : n) {		
			System.out.print(i);
			System.out.print(" ");

		}
	}		
}
