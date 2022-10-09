package kr.co.applestar.ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_10 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		
		SimpleDateFormat f1, f2, f3, f4 ,f5;
		
		f1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		f2 = new SimpleDateFormat("yyyy/MM/dd");
		f3 = new SimpleDateFormat("yyyy/MM/dd");
		f4 = new SimpleDateFormat("a H:mm:ss");
		f5 = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println(f1.format(today));
		System.out.println(f2.format(today));
		System.out.println(f3.format(today));
		System.out.println(f4.format(today));
		System.out.println(f5.format(today));
		
	}

}
