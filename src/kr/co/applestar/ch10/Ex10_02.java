package kr.co.applestar.ch10;

import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		date1.set(2022,6,3);
		
		System.out.println(toString(date1));
		
		System.out.println(date1.get(Calendar.YEAR));
		System.out.println(date1.MONTH);
		System.out.println(date1.DATE);
		
		date1.set(Calendar.YEAR, 2022);
		date1.set(Calendar.MONTH, 7);
		date1.set(Calendar.DATE, 3);
		
		System.out.println(date1.YEAR);
		System.out.println(date1.MONTH);
		System.out.println(date1.DATE);
		
		System.out.println("[" + DAY_OF_WEEK[3] + "]");
		System.out.println(date1.get(Calendar.DAY_OF_WEEK));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " 
	          + (date.get(Calendar.MONTH) + 1) + "월 " 
			  + date.get(Calendar.DATE) + "일";    
	}

}
