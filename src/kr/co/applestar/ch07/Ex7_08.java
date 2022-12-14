package kr.co.applestar.ch07;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액부족");
			return ;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "구입 완료");
	}
}

public class Ex7_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 잔액 : " + b.money);
		System.out.println("현재 보너스 : " + b.bonusPoint);
	}

}
