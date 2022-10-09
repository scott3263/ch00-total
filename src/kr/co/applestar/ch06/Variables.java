package kr.co.applestar.ch06;

class Variable{
	
	int iv;
	static int cv ;
	
	public int getIv() {
		return iv;
	}

	public void setIv(int iv) {
		this.iv = iv;
	}

	public static int getCv() {
		return cv;
	}

	public static void setCv(int cv) {
		Variable.cv = cv;
	}
	
	public  void CheckValues() {
		System.out.println("iv=" + this.iv + ", cv=" + cv);
	}
}

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable v1 = new Variable();
		Variable v2 = new Variable();
		Variable v3 = new Variable();
		
		v1.setIv(1);
		Variable.setCv(2);
		
		v1.CheckValues();
		
		v2.setIv(3);
		Variable.setCv(4);
		
		v1.CheckValues();
		v2.CheckValues();
	}

}
