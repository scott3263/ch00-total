package kr.co.applestar.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(9));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 5));
		print(list1, list2);
		
		list2.add(new Integer(11));
		Collections.sort(list1);
		Collections.sort(list2);
		
		
		print(list1, list2);
		
		System.out.println(list1.containsAll(list2));
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
	}

}
