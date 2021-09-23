package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name :");
		String nameDepartment = sc.nextLine();
		System.out.println();

		System.out.println("Enter woker data :");
		System.out.print("Name : ");
		String nameWorker = sc.nextLine();
		System.out.println();

		System.out.print("LEVEL : ");
		String workerLevel = sc.nextLine();
		System.out.println("");

		System.out.print("Base Salary : ");
		Double salaryBase = sc.nextDouble();
		sc.nextLine();
		System.out.println("");

		Worker worker = new Worker(nameWorker,WorkerLevel.valueOf(workerLevel),salaryBase
				,new Department(nameDepartment));
		System.out.println("How many contracts to this worker");
		int contracts = sc.nextInt();
		sc.nextLine();

		for(int i = 0 ; i < contracts;i++) {
			System.out.printf("Enter contract #%d data : ",i);

			System.out.print("Date : ");
			Date contractsDate = sdf.parse(sc.next());

			System.out.print("Value per hour : ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();

			System.out.print("Duration(hours) : ");
			int durationHours= sc.nextInt();
			sc.nextLine();

			HourContract contract = new HourContract(contractsDate, valuePerHour, durationHours);
			worker.addContract(contract);			
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0,2));// .substring(inicio,fim)- para na posicao dois, porque sempre tem que parar 1 mais
		int year = Integer.parseInt(monthAndYear.substring(3));// vai recortar da posicao 3 em diante;
		
		System.out.println("Name : "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for : "+monthAndYear +" : "
				+String.format("%.2f",worker.income(year, month)));


//String.format("%.2f",worker.income(year, month))) = comando para que o valor
// apareca com duas casas decimais		


		sc.close();


	}

}
