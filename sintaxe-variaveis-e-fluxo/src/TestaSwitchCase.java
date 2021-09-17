import java.util.Locale;
import java.util.Scanner;

public class TestaSwitchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String dia = null;
		
		/*System.out.println("1- Segunda \n2- Terca \n3- quarta \n4- Quinta"
				+ "\n5- Sexta \n6- Sabado \n7- Domingo");*/
		 int opc= sc.nextInt();
		
		while(opc!=8) {		
		 switch(opc) {
				case 1:
					dia ="Segunda";
					System.out.println(dia);
					opc= sc.nextInt();
					break;
				case 2:
					dia="Terca";
					System.out.println(dia);
					opc= sc.nextInt();
					break;
				case 3:
					dia="Quarta";
					System.out.println(dia);
					opc= sc.nextInt();
					break;
				case 4:
					dia="Quinta";
					System.out.println(dia);
					opc= sc.nextInt();
					break;
				case 5:
					dia="Sexta";
					System.out.println(dia);
					opc= sc.nextInt();
				case 6:
					dia="Sabado";
					System.out.println(dia);
					opc= sc.nextInt();
				case 7:
					dia="Domingo";
					System.out.println(dia);
					opc= sc.nextInt();
				case 8:
					System.out.println("Cancelar");
					break;
				default:
					System.out.println("Tente novamente!!");
					opc= sc.nextInt();
				}
		}
				
				sc.close();
				
	   }
}
