package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class Ex_7 {

	public static void main(String[] args) {
		byte[] arr1= {0,1,2};
		byte[] arr2= {3,4,5};
		byte[] arr3= {6,7,8};
		byte[] outSrc= null;
		
		Vector v = new Vector<>();// 여기서 저장된 순서로 입력됨
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr3));
		v.add(new ByteArrayInputStream(arr2));

		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output= new ByteArrayOutputStream();
		int date=0;
		try {
			while((date=input.read())!=-1) {
				output.write(date);
			}
		} catch (IOException e) {e.printStackTrace();}
		
	outSrc=output.toByteArray();
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println(Arrays.toString(arr3));
	System.out.println(Arrays.toString(outSrc));
	
	
	}

}
