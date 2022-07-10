package Ch06;

public class Quiz_17 {
	static int[] shuffle(int[] arr){
		if(arr==null || arr.length==0)
			return arr;

		
		for(int i = 0;i<arr.length;i++){
			int j=(int) ((Math.random()*arr.length));
			
			int tmp = arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			
			
		}
		
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
		int[] original= {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result=shuffle(original);
		System.out.println(java.util.Arrays.toString(original));

	}

}
