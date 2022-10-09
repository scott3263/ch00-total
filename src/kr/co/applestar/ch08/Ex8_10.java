package kr.co.applestar.ch08;

import java.io.*;

public class Ex8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println('1');
			System.out.println(args.length);
			System.out.println(args[0]);
			File f = createFile(args[0]);
			System.out.println(f.getName() + "파일생성 성공");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "다시 해보거라");
		}

	}
	
	static File createFile(String fileName) throws Exception{
		if ( fileName == null || fileName.equals(""))
			throw new Exception("유효하지 않은 파일명이다");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}
