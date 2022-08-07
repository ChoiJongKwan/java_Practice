package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJun10951 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		//String A=  br.readLine();
		String tmp= "";
		
		while((tmp=br.readLine()) != null) {
		
		String[] As= tmp.split(" ");
			int a=Integer.parseInt(As[0]);
			int b=Integer.parseInt(As[1]);
			bw.write(a+b+"\n");
		
		}
		bw.flush();
		bw.close();
		
		
	}
}
