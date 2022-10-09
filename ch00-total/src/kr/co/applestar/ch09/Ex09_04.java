package kr.co.applestar.ch09;

public class Ex09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int idx = 0 ; idx < 100; idx++) {
			double d = Math.random();
			int i = (int)(d * 10);
			System.out.println(d + " , " + i);
		}
	}

}
