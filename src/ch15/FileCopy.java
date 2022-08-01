package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
//Ex_5
	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream(args[0]);
			FileOutputStream fos= new FileOutputStream(args[1]);
			
			int date=0;
			while((date=fis.read())!=-1) {
				fos.write(date);
				fis.close();
				fos.close();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
