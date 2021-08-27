package Datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataSoma {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:00:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		int minutos = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutos: " + minutos);
		
		int mes = 1 + cal .get(Calendar.MONTH);
		
		System.out.println("Mês: " + mes);
		
	}

}
