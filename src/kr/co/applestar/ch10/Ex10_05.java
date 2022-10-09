package kr.co.applestar.ch10;

import java.util.Calendar;

public class Ex10_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("argument 갯수 : " + args.length );
		
		if ( args.length !=2 ) {
			
			System.out.println("argument 오류");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int mon = Integer.parseInt(args[1]) ;
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		System.out.println(year + " ," + mon);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, mon -1, 1);
		eDay.set(year, mon , 1);
		
		eDay.add(Calendar.DATE,  -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("START_DAY_OF_WEEK : " + START_DAY_OF_WEEK);
		System.out.println("END_DAY : " + END_DAY);
		
		System.out.println("  " + year + "년 " + (mon -1 ) + "월");
		System.out.println("SU MO TU WE TH FR SA");
		
		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("---");
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++ ) {
			System.out.print((i < 10) ? " "  + i + " " :  i + " ");
			if ( n%7 == 0) System.out.println();
		}
		
		//System.out.println(toString(sDay));
		//System.out.println(toString(eDay));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " 
	          + (date.get(Calendar.MONTH) + 1) + "월 " 
			  + date.get(Calendar.DATE) + "일";    
	}
}
