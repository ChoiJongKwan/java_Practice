package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJun15552 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String N= br.readLine();
		int A=Integer.parseInt(N);
		  

		for(int i=0;i<A;i++) {
			N= br.readLine();
			String[] B= N.split(" ");
			
			bw.write((Integer.parseInt(B[0])+ Integer.parseInt(B[1]))+"\n");
			
		};
		bw.flush();
}
}
