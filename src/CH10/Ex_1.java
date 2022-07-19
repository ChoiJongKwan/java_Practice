package CH10;

import java.util.Calendar;

public class Ex_1 {

	public static void main(String[] args) {
		Calendar today =  Calendar.getInstance();
		System.out.println("올해의 년도 : "+today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월) : "+today.get(Calendar.MONTH));
		System.out.println("올해의 몇째주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의  몇째주 : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이달의 몇일: "+today.get(Calendar.DATE));
		System.out.println("이달의 몇일: "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇일: "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7 1=일요일) : "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이달의 몇번째 요일 : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전 오후(0=오전 1=오후) : "+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : "+today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : "+today.get(Calendar.SECOND));
		System.out.println("천분의1초 : "+today.get(Calendar.MILLISECOND));
		System.out.println(today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		System.out.println(today.getActualMaximum(Calendar.DATE));
	}

}
