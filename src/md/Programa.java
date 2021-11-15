package md;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa {

	public static void main(String[] args)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();//instanciar calend�rio 
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); //adicionar 4 horas do dia
		d = cal.getTime(); //atualizar hora 
		System.out.println(sdf.format(d));
	}

}
