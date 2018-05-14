package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculadorTempoMinutos {
	
	public static Date calcularTempoMinutos(Date data, int minutos) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MINUTE, minutos);

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dataFormatada = format.format(calendar.getTime());
		Date novaData = null;
		
		try {
			novaData = format.parse(dataFormatada);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return novaData;
	}
}
