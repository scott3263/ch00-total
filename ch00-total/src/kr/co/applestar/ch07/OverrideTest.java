package kr.co.applestar.ch07;

class Point3{
	int x;
	int y;
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class Point3D extends Point3{
	int z;
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		p.x = 1;
		p.y = 2;
		p.z = 3;
		System.out.println(p.getLocation());

	}

}
