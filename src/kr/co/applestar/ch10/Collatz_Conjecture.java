package kr.co.applestar.ch10;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Collatz_Conjecture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		long l = Long.parseLong(args[0]);
		int maxCnt = 0 ;
		long maxValue = 0 ;
		
		String str;
		DecimalFormat fm = new DecimalFormat("###,###");
		Date now;
		SimpleDateFormat f = new SimpleDateFormat("H:mm:ss");
		
		File file = new File("list.txt");
		
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
		
		try {
			
			long numCnt = 0;
			
			for (long idx = 2; idx <= l; idx++ ) {
				
				long ll = idx;
				int cnt = 0 ;
				long myMaxValue = 0;
				
				while( ll != 1) {
					//System.out.println("   ll = " + ll);
					if (ll % 2 == 0) {
					  //System.out.println("      " + ll + " = 짝수"); 
					  ll = ll / 2; 
					} else {
					  //System.out.println("      " + ll + " = 홀수"); 
					  ll = (ll * 3) + 1;
					  if (myMaxValue < ll) {
						  myMaxValue = ll;
					  }
					}
					cnt++;
				}
				
				if (maxValue < myMaxValue){
					maxValue = myMaxValue;
					numCnt++;
					
					now = new Date();
					FileWriter fw = new FileWriter(file, true);
					BufferedWriter writer = new BufferedWriter(fw);
					str = f.format(now) + " [" + numCnt + "] idx=" + fm.format(idx) + " maxCnt=" + fm.format(maxCnt) + " maxValue=" + fm.format(maxValue);
					writer.append(str + "\n");
					//System.out.println(str);
					writer.close();
				}
				
				if (maxCnt < cnt) {
					numCnt++;
					maxCnt = cnt;
					now = new Date();
					FileWriter fw = new FileWriter(file, true);
					BufferedWriter writer = new BufferedWriter(fw);
					str = f.format(now) + " [" + numCnt + "] idx=" + fm.format(idx) + " maxCnt=" + fm.format(maxCnt) + " maxValue=" + fm.format(maxValue);
					writer.append(str + "\n");
					writer.close();
					//System.out.println(str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.append("end\n");
		writer.close();
		System.out.println("end");
	}
	
}
