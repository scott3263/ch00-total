package kr.co.applestar.ch08;

import java.util.Objects;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPAD",1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(kind, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(kind, other.kind) && number == other.number;
	}

	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}
public class Ex09_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
