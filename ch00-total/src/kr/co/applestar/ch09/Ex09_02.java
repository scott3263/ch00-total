package kr.co.applestar.ch09;

class Person{
	long id;
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		return id == ((Person)obj).id;
	}
	
	Person (long id){
		this.id = id;
	}
}

public class Ex09_02 {

	public static void main(String[] args) {
		Person p1 =new Person(1);
		Person p2 =new Person(1);

		if (p1.equals(p2))
			System.out.println("p1 == p2");
		else
			System.out.println("p1 != p2");
	}

}
