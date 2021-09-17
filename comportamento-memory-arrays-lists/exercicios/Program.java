import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int quantidade = sc.nextInt();

		RegistroAluguel[] vet= new RegistroAluguel[10];

		for (int i = 1; i <= quantidade; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d ",i);
			System.out.println();

			System.out.print("Name : ");
			String name = sc.nextLine();

			System.out.print("Email : ");
			String email = sc.nextLine();

			System.out.print("Room : ");
			int room = sc.nextInt();

			vet[room] = new RegistroAluguel(name,email,room);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
		sc.close();
	}
}

