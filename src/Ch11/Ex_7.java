package Ch11;

import java.util.*;

public class Ex_7 {

	public static void main(String[] args) {
		String[] strarr = {"cat","Dog","lion","tiger"};
		Arrays.sort(strarr);
		System.out.println(Arrays.toString(strarr));
		
		Arrays.sort(strarr,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strarr));
		
		Arrays.sort(strarr,new Descending());
		System.out.println(Arrays.toString(strarr));
	}
	

}
class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1= (Comparable) o1;
			Comparable c2= (Comparable) o2;
			return c1.compareTo(c2)*-1;
		}
	
	return -1;
}}