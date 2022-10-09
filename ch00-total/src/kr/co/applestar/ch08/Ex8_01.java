package kr.co.applestar.ch08;

public class Ex8_01 {

	public static void main(String[] args) {
		
		try {
			System.out.println('1');
			
			Exception e = new Exception("고의발생");
			throw e;
			
			//System.out.println(0/0);
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println('2');
			ae.printStackTrace();
			System.out.println('3');
			System.out.println(ae.getMessage());
			System.out.println('4');
		} catch (Exception e) {
			System.out.println('5');
			System.out.println(e);
			System.out.println('6');
		}
	}

}
