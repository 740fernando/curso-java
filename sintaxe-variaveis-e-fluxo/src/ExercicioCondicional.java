import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		int minutos;
		double conta =50.0;

		System.out.print("Quantidade de minutos consumidos : ");
		minutos = sc.nextInt();

		if(minutos > 100) {
			conta+= (minutos-100)*2.0;		
		}
		System.out.printf("Valor a pagar é R$%.2f%n",conta);
		sc.close();
	}
}
