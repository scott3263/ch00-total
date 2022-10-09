package kr.co.applestar.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_09 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#,###.##");
		Number num = df.parse("1,234,567.89");
		
		double d = num.doubleValue();
		
		System.out.println(d);
		
	}

}
