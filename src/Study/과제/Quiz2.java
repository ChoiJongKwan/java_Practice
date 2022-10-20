package 과제;

class worker2{
	private String name;
	private String major;
	public worker2(String name, String major) {
		this.name=name;
		this.major=major;
	}
	
	public void workerInfo() {
		System.out.println("사원의 이름은: "+name);
		System.out.println("사원의 부서은: "+major);
	}
}

class Regular2 extends worker2{
	private int number;
	private String postion;
	private int pay;
	private int bonue;
	private int salary;
	public Regular2(String name, String major,int number,String postion,int pay,int bonue) {
		super(name, major);
		this.number=number;
		this.postion=postion;
		this.pay=pay;
		this.bonue=bonue;
		this.salary=pay+bonue;
	}
	public void workerInfo() {
		super.workerInfo();
		System.out.println("사원의 사원번호는 :"+number);
		System.out.println("사원의 직책은 :"+postion);
		System.out.println("사원의 본봉는 :"+pay);
		System.out.println("사원의 수당는 :"+bonue);
		System.out.println("사원의 월급는 :"+salary);
	}
}
class Temporary2 extends worker2{
	private String personNum;
	private int time;
	private int pay;
	private int salary;
	public Temporary2(String name, String major,String personNum,int time,int pay) {
		super(name, major);
		this.personNum=personNum;
		this.time=time;
		this.pay=pay;
		this.salary=time*pay;		
	}
	
	public void workerInfo() {
		super.workerInfo();
		System.out.println("사원의 주민번호는 :"+personNum);
		System.out.println("사원의 본봉는 :"+pay);
		System.out.println("사원의 근무시간은 :"+time);
		System.out.println("사원의 시급은 :"+pay);
		System.out.println("사원의 급여은 :"+salary);
	}
	
}

public class Quiz2 {
	public static void main(String[] args) {
	Regular2 rg= new Regular2("cjk", "java", 1, "bujang", 10000000, 200000);
	rg.workerInfo();
	System.out.println();
	Temporary2 tmp= new Temporary2("jk", "java", "1111-1111", 52, 100000);
	tmp.workerInfo();
	}
}
