package br.com.exceptions.reserva.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import br.com.exceptions.reserva.exceptions.DomainException;

public class Reservation implements Comparable<Reservation>{
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer room, Date checkIn, Date checkOut)  {
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = room;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoom() {
		return roomNumber;
	}
	public void setRoom(Integer room) {
		this.roomNumber = room;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public long duration() {
		long diff= checkOut.getTime()-checkIn.getTime();//getTime() - retorna o valor em milisegundos
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);//TimeUnit- conventer milessegundo para dias
	}
	public void updateDates(Date checkIn, Date checkOut) {
		Date now= new Date();
		if(checkIn.before(now)||checkOut.before(now)) {
			throw new DomainException( "Reservation date for update must be future dates");
		}
		if(!checkOut.after(checkIn)) {
			throw new DomainException( "Check-out date must after check-in date");
		}		
		this.checkIn=checkIn;
		this.checkOut=checkOut;
	}	
	@Override
	public String toString() {
		return "Room: "
				+ roomNumber
				+" , check-in : "
				+sdf.format(checkIn)
				+" , check-out : "
				+sdf.format(checkOut)
				+", "
				+duration()
				+" nights";
	}
	@Override
	public int compareTo(Reservation reservation) {
		return (int) (this.checkIn.getTime()-this.checkOut.getTime());
	}
}
