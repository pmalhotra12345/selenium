package learnJava;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendarDemo {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			//current date..current time./
			
			Calendar cal = Calendar.getInstance();
			
			SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
			SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
			System.out.println(cal.get(Calendar.DAY_OF_MONTH));
			System.out.println(cal.get(Calendar.AM_PM));
			System.out.println(cal.get(Calendar.AM_PM));
	}
}



