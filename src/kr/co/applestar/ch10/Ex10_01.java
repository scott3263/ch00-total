package kr.co.applestar.ch10;

import java.time.LocalDate;
import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		int thisYear = cal.get(Calendar.YEAR);
		int thisMonth = cal.get(Calendar.MONTH);
		int thisDate = cal.get(Calendar.DATE);
		int thisDay = cal.get(Calendar.DAY_OF_WEEK);
		//int lastDayOfYear = cal.getActualMaximum(thisYear);
		
		System.out.println(thisYear);
		System.out.println(thisMonth);
		System.out.println(thisDate);
		System.out.println(thisDay);
		//System.out.println(lastDayOfYear);
		
	}

}
