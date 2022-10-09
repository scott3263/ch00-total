package kr.co.applestar.ch07;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	
	Product2(){
		
	}
}

class Tv2 extends Product2{
	Tv2(){
		super(100);
	}
	public String toString(){
		return "Tv2";
	};
}
class Computer2 extends Product2{
	Computer2(){
		super(200);
	}
	public String toString(){
		return "Computer2";
	};
}

class Buyer2{
	int money = 1000 ;
	int bonusPoint = 0 ;
	Product2[] cart = new Product2[10];
	
	int idx = 0 ;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		cart[idx++] = p;
		System.out.println("구입상품 : " + p);
		
	}
	
	/**
	 * 
	 */
	void summary() {
		int sum = 0;
		String itemList= "";
		
		for(int i = 0; i <cart.length; i++) {
			if (cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		
		System.out.println("총급액 : " + sum);
		System.out.println("구입물품 : " + itemList);
	}
}
public class Ex7_09 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.summary();
		
		System.out.println("현재 잔액 : " + b.money);
		System.out.println("현재 보너스 : " + b.bonusPoint);
	}

}
