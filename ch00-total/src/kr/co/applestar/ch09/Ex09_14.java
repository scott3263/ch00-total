package kr.co.applestar.ch09;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex09_14 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? " + (i ==i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		System.out.println(i.toString() + " , " + i2.toString());
		
		System.out.println("MAX_VALUE : " + BigInteger.ONE);
		System.out.println("MIN_VALUE : " + Float.MIN_VALUE);
		System.out.println("SIZE : " + Float.SIZE);
		System.out.println("BYTES : " + Float.BYTES);
		System.out.println("TYPE : " + Float.TYPE);
	}

}
