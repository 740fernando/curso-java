package br.com.exceptions.reserva.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.exceptions.reserva.exceptions.DomainException;
import br.com.exceptions.reserva.model.entities.Reservation;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			

			System.out.println("Room number : ");
			int number = sc.nextInt();
			System.out.print("Check-int date(dd/MM/yyyy) : ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date(dd/MM/yyyy) : ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation :"+reservation);


			System.out.println();
			System.out.println("Enter data to update the reservation : ");
			System.out.println("Check-in date (dd/MM/yyyy) : ");
			checkIn= sdf.parse(sc.next());
			System.out.println("Check-out date(dd/MM/yyyy): ");
			checkOut=sdf.parse(sc.next());
			
			reservation.updateDates(checkIn,checkOut);
			System.out.println("Reservation : "+reservation);
			
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}catch(DomainException e) {
			System.out.println("Error in reservation : "+e.getMessage());
		}
		catch(RuntimeException e ) {
			System.out.println("Unexpected error");
		}

		sc.close();

	}
/**
 * 	• Cláusula throws: propaga a exceção ao invés de trata-la
	• Cláusula throw: lança a exceção / "corta" o método
	• Exception: compilador obriga a tratar ou propagar
	• RuntimeException: compilador não obriga
	• O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e
flexível, usando boas práticas
	
	Vantagens:
	• Lógica delegada
	• Construtores podem ter tratamento de exceções
	• Possibilidade de auxílio do compilador (Exception)
	• Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for
disparada, a execução é interrompida e cai no bloco catch correspondente.
	• É possível capturar inclusive outras exceções de sistema
 */
}
