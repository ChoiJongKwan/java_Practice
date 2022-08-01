package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileViewer {
//Ex_4
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\ch15\\FileViewer.java");
		//FileInputStream fis= new FileInputStream(args[0]);
		int date=0;
		while((date=fis.read())!=-1) {
			char c= (char) date;
			System.out.print(c);
		}
		
		
		
	}

}
