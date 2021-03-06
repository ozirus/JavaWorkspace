package tr.gov.tubitak.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeProcess {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		//A�a��da sonu� 1 veya -1 �eklinde d�necektir.
		System.out.println(date.compareTo(new Date(123421)));
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println(df.format(date));
		
		//date elde etmek i�in 

		//calendar kullan�m�
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(Calendar.HOUR_OF_DAY, 10);
		System.out.println(cal.getTime());
		
		//Do�um tarihine 1 y�l ekleme �rne�i
		Calendar newCal = Calendar.getInstance();
		try {
			newCal.setTime(df.parse("27-10-1988"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		newCal.add(Calendar.YEAR, 1);
		System.out.println(df.format(newCal.getTime()));
		
		
		//tarih kar��la�t�rmalar�
		
		Date beforeDate = new Date(98,10,10);
		Date afterDate = new Date(99,10,10);
		Date equalDate = new Date(99,10,10);
		
		int comparison1 = beforeDate.compareTo(afterDate);
		int comparison2 = afterDate.compareTo(beforeDate);
		int comparison3 = afterDate.compareTo(equalDate);
		
		System.out.println("birinci : "+comparison1 +"\nikinci : "+comparison2 +"\n���nc� : "+comparison3);
		
	}

}
