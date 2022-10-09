package kr.co.applestar.ch07;

class A {
	public void methodA(I i) {
		i.methodB();
	}
}

interface I{
	void methodB();
}
class B implements I{
	public void methodB() {
		System.out.println("MethddB()");
	}
}

public class Ex7_12 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
		System.out.println(a.getClass());
	}

}
