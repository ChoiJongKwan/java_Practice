package Ch11;
import java.util.*;
public class Ex_5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
//		list.add("1","2","3","4","5");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4"); 
		list.add("5");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
