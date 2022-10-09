package kr.co.applestar.ch02;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 4 , y = 2;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("tmp=" + tmp);
		System.out.println("x=" + x);
		System.out.printf("y=" + y);

		
	}

}
