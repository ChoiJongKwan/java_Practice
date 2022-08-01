package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex_3 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output =null;
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		System.out.println("Input source  :"+Arrays.toString(inSrc));
		try {
			while(input.available()>0) {
				int len=input.read(temp);
				output.write(temp,0,len);
				
				outSrc=output.toByteArray();
				printArrays(temp,outSrc);
			}
		} catch (Exception e) {}
		
	}
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          :"+Arrays.toString(temp));
		System.out.println("output source :"+Arrays.toString(outSrc));
	}
	
	
}
