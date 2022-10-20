package day07;

import java.util.Scanner;

class Student{	
	private int num;
	private String name;
	private int kor;
	private int math;
	private int total;
	private double ave;
	private char grade;
	 
	public void inputInfo() {
		Scanner sc= new Scanner(System.in);
		System.out.println("학생 번호를입력하세요");
		num=sc.nextInt();
		System.out.println("학생 이름을 입력하세요");
		name=sc.next();
		System.out.println("국어 점수를 입력하세요");
		kor=sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math=sc.nextInt();
		
	}
	
	public void scoreCheck() {
		total=kor+math;
		ave=total/2.0;
		switch ((int)ave/10) {
		case 10:
		case 9: grade='A';	
			break;
		case 7: grade='C';
			break;
		case 6: grade='D';
			break;
				
		default: grade='F';
			break;
		}
		
	}
	public void studentInfo() {
		System.out.println("학생번호:"+num);
		System.out.println("학생이름:"+name);
		System.out.println("국어점수:"+kor);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+ave);
		System.out.println("학점:"+grade);
	}
	
	
}

public class Test03_Quiz {
	public static void main(String[] args) {
		Student[] stu= new Student[3];
		
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student();
			stu[i].inputInfo();
			stu[i].scoreCheck();
		}
		for(int i=0;i<stu.length;i++) {
			stu[i].studentInfo();
			System.out.println();
			
		}
	}
}
