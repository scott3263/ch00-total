package kr.co.applestar.ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_02 {

	public static void main(String[] args) {

		/*
		 * ArrayList<Student> list = new ArrayList<Student>(); list.add(new
		 * Student("박대진")); list.add(new Student("박세연")); list.add(new Student("박세준"));
		 * list.add(new Student("이주원"));
		 * 
		 * Iterator<Student> it = list.iterator();
		 * 
		 * while(it.hasNext()) { Student s = it.next(); System.out.println(s.name); }
		 */
		
		HashMap<String, Student> map = new HashMap<>();
		
		map.put("박대진", new Student("박대진"));
		
		Student s = map.get("박대진");
		
		System.out.println(map);
		System.out.println(s);
	}
	
}

class Student{
	String name = "";
	
	
	Student(String name){
		this.name = name;
	}
}
