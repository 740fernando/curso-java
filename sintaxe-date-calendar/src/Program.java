import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
//CONTROL+SHIFT+O= apaga as dependencias que nao estao sendo utilizadas
public class Program {
	/*
	 * 			Date
	  Representa um INSTANTE
	  Pacote java.util
	  https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
	  
	  Um objeto Date internamente armazena:
		• O número de milissegundos desde a meia noite do dia 1 de janeiro de
	1970 GMT (UTC)
		• GMT: Greenwich Mean Time (time zone)
		• UTC: Coordinated Universal Time (time standard)
		
				Padrão ISO 8601 e classe Instant
		• Formato: yyyy-MM-ddTHH:mm:ssZ
		• Exemplo: "2018-06-25T15:42:07Z"
		• Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
	 */
	public static void main(String[] args) throws ParseException {
		
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // criar um objeto com o formato da data
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//especifica o time zone
		
		Date x1 = new Date();//cria um objeto contento o  data/horario atual
		Date x2 = new Date(System.currentTimeMillis());// pega o instante do sistema, converte para milesegundos e exibe o valor
		Date x3 = new Date(0L);//criando uma date passando um parametro "0L", Exibe a data de inicio que o sistema consegue armazenar
		Date x4 = new Date(1000L *60L*60L*5L);
		
		Date y1 = sdf1.parse("25/06/2018");// variavel do tipo date
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		//Padrão ISO 8601 e classe Instant
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));// O "Z" no final determina o formato "UTC
		
		System.out.println("-------Sem formato-------");
		System.out.println("x1 : "+x1);
		System.out.println("x2 : "+x2);
		System.out.println("x3 : "+x3);
		System.out.println("y1 : "+x4);
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		System.out.println("-------Horario do Brasil-------");
		System.out.println("x1 : "+sdf2.format(x1));
		System.out.println("x2 : "+System.currentTimeMillis());//e, milesegundos
		System.out.println("x3 : "+sdf2.format(x3));
		System.out.println("y1 : "+sdf2.format(x4));
		System.out.println("y1 : "+sdf2.format(y1));
		System.out.println("y2 : "+sdf2.format(y2));
		System.out.println("y3 : "+sdf2.format(y3));// NAO EXIBE NO FORMATO UTC
		System.out.println("------Horario UTC--------");
		System.out.println("x1 : "+sdf3.format(x1));
		System.out.println("x2 : "+sdf2.format(x2));
		System.out.println("x3 : "+sdf3.format(x3));
		System.out.println("y1 : "+sdf3.format(x4));
		System.out.println("y1 : "+sdf3.format(y1));
		System.out.println("y2 : "+sdf3.format(y2));
		System.out.println("y3 : "+sdf3.format(y3));
		System.out.println("------Somando uma unidade de tempo--------");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d= Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance(); // foi instanciado o calendar
		cal.setTime(d); //SETA UM valor de "d" no objeto cal
		cal.add(Calendar.HOUR_OF_DAY, 4);// VAI SER ACRESCENTADO 4 HORAS
		d=cal.getTime();//Pega o valor que esta guardado no objeto cal e joga para d
		System.out.println(sdf.format(d)); // exibe no formato sdf
		System.out.println("------Obtendo uma unidade de tempo--------");
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH);
		
		System.out.println("Minutes : "+minutes );
		System.out.println("Month : "+month);
		
		
		
		
	}
}
