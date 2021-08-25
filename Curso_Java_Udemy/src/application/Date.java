package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;


public class Date {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		java.util.Date x1 = new java.util.Date();
		java.util.Date x2 = new java.util.Date(System.currentTimeMillis());
		java.util.Date x3 = new java.util.Date(0L);//0 milisegundos da origem do padr�o Date em 01 Jan 1970 
		
		
		java.util.Date y1 = sdf1.parse("25/06/2018");
		java.util.Date y2 = sdf2.parse("25/06/2018 15:42:07");
		java.util.Date y3 = java.util.Date.from(Instant.parse("2018-06-25T15:42:07Z"));// horario UTC, vai imprimir 12:42, pq Brasil � menos 3 horas
		
		System.out.println("X1: "+ sdf2.format(x1));
		System.out.println("X2: "+ sdf2.format(x2));
		System.out.println("X3: "+ sdf2.format(x3));
		System.out.println("Y1: "+ sdf2.format(y1));
		System.out.println("Y2: "+ sdf2.format(y2));
		System.out.println("Y3: "+ sdf2.format(y3));
		System.out.println("---------------------------");
		// abaixo mostrando hor�rios no hor�rio GMT
		System.out.println("X1: "+ sdf3.format(x1));
		System.out.println("X2: "+ sdf3.format(x2));
		System.out.println("X3: "+ sdf3.format(x3));
		System.out.println("Y1: "+ sdf3.format(y1));
		System.out.println("Y2: "+ sdf3.format(y2));
		System.out.println("Y3: "+ sdf3.format(y3));
		
		
		
		
		
		
		
		
		
	}

}
