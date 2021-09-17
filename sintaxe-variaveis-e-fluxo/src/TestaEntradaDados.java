import java.util.Locale;
import java.util.Scanner;//

public class TestaEntradaDados {
	public static void main(String[] args) {

		// Para fazer entrada de dados, foi criado um objeto do tipo "Scanner"
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);// estou associando meu objeto scanner ao teclado do modo console
		String x;
		int y;
		double z;
		char w;

		// Entrada de dados tipo String
		System.out.print("Digite uma palavra: ");
		x = sc.next();
		System.out.println(" ");
		System.out.printf("Voce digitou : %s%n", x);

		// Entrada de dados tipo Inteiro
		System.out.print("Digite um numero: ");
		y = sc.nextInt();// Comando para leitura de inteiro
		System.out.println(" ");
		System.out.printf("Voce digitou : %d%n", y);

		// Entrada de dados tipo Double
		System.out.print("Digite o preco: ");
		z = sc.nextDouble();// Comando para leitura de Double
		System.out.println(" ");
		System.out.printf("Voce digitou : %.2f%n", z);

		// função charAt() armazena o caracter na posição que for passada no parametro
		System.out.print("Digite um caracter : ");
		w = sc.next().charAt(0);// Comando para leitura de char
		System.out.println(" ");
		System.out.printf("Voce digitou : %s", w);

		sc.close();// funcao para desalocar o recurso criado
	}
}
