package ch15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_11 {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader(".\\src\\ch15\\Ex_11.java");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			for(int i=1;(line=br.readLine())!=null;i++) {
				// f 를 포함한 라인출력
				if(line.indexOf("f")!=-1)
					System.out.println(i+":"+line);
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}





	}

}
