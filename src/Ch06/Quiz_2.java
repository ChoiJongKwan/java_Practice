package Ch06;
public class Quiz_2 {
	public static void main(String[] args) {
		// 다음과 같은 실행결과를 얻도록 std클래스에 생성자와 info()를 추가하시오
	std2 s= new std2("홍길동",1,1,100,60,70);
	String str =s.info();
	System.out.println(str);
	}
}

class std2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	std2(String name, int ban,int no,int kor,int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	 String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+((int)((kor+eng+math)/3f * 10 + 0.5f) / 10f);

		
		
	}
}

