package kr.co.applestar.ch12;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{public String toString() {return "Apple";	}}
class Grape extends Fruit{public String toString() {return "Grape";	}}
class Toy                {public String toString() {return "Toy";	}}

interface Eatable{
	
}

public class Ex12_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
	}
	
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {list.add(item);}
	T get(int i)     {return list.get(i);}
	int size()       {return list.size();}
}
