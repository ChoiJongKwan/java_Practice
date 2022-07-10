package Ch06;

public class Quiz_3 {

	public static void main(String[] args) {
		std3 s = new std3();
		s.name = "홍길동 "; 
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 :" + s.name); 
		System.out.println(" 총점:" + s.getTotal()); 
		System.out.println(" 평균:" + s.getAvg()); 

	}

}
class std3{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	std3(){} // 기본 생성자
	
	std3(String name, int ban,int no,int kor,int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	
	int getTotal() {
		int sum;
		return sum=kor+eng+math;
	}
	float getAvg() {
		float avg= (int)(getTotal()/ 3f *10+0.5f)/10f;
		return avg;
	}
	 String info() {
			return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAvg();

		}
}