package 과제;

import java.util.Scanner;

class worker{
	private String name;
	private String major;
	public worker() {}
	public void setWorker() {
		Scanner sc= new Scanner(System.in);
		System.out.println("사원의 이름을 입력하세요");
		this.name=sc.next();
		System.out.println("사원의 부서를 입력하세요");
		this.major=sc.next();
	}
	public void workerInfo() {
		System.out.println("사원의 이름은: "+name);
		System.out.println("사원의 부서은: "+major);
	}
}

class Regular extends worker{
	private int number;
	private String postion;
	private int pay;
	private int bonue;
	private int salary;
	public Regular() {}
	public void setWorker() {
		Scanner sc=new Scanner(System.in);
		super.setWorker();
		System.out.println("사원의 사원번호를 입력하세요");
		this.number=sc.nextInt();
		System.out.println("사원의 직책를 입력하세요");
		this.postion=sc.next();
		System.out.println("사원의 본봉을 입력하세요");
		this.pay=sc.nextInt();
		System.out.println("사원의 수당을 입력하세요");
		this.bonue=sc.nextInt();
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
class Temporary extends worker{
	private String personNum;
	private int time;
	private int pay;
	private int salary;

	public void setWorker() {
		Scanner sc=new Scanner(System.in);
		super.setWorker();
		System.out.println("주민번호를 입력하세요");
		this.personNum=sc.next();;
		System.out.println("일한 시간을 입력하세요");
		this.time=sc.nextInt();
		System.out.println("사원의 시급을 입력하세요");
		this.pay=sc.nextInt();
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

public class Quiz1 {
	public static void main(String[] args) {
		Regular rg= new Regular();
		rg.setWorker();
		rg.workerInfo();
		System.out.println();
		
		Temporary tmp= new Temporary();
		tmp.setWorker();
		tmp.workerInfo();
		
	}
}
