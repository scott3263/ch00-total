package kr.co.applestar.ch07;

class Point{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class Circle extends Point{
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
}
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setX(1);
		c.setY(2);
		c.setR(3);
		
		System.out.println(c.getX());
		System.out.println(c.getY());
		System.out.println(c.getR());
	}

}
