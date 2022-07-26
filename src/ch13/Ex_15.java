package ch13;

import java.util.ArrayList;

class Customer2 implements Runnable{
	private Table2 table;
	private String food;
	
	public Customer2(Table2 table, String food) {
		this.table=table;
		this.food=food;
	}
	public void run() {
		while(true) {
			try {Thread.sleep(100);} catch (Exception e) {}
			String name= Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name+" ate a "+ food);
		}
	}
}
class Cook2 implements Runnable{
	private Table2 table;
	Cook2(Table2 table){this.table=table;}
	public void run() {
		while(true) {
			int idx= (int)(Math.random()*table.disNum());
			table.add(table.dishNames[idx]);
			try {Thread.sleep(10);}catch(InterruptedException e){}
		}
	}
}
class Table2{
	String[] dishNames= {"dount", "dount","burger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes= new ArrayList<>();
	
	public synchronized void add(String dish) {
		while(dishes.size()>=MAX_FOOD) {
			String name= Thread.currentThread().getName();
			System.out.println(name+"is waiting.");
			try {
				wait();
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		dishes.add(dish);
		notify();
		System.out.println("Dishes: "+dishes.toString());
	}
	
	
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			while(dishes.size()==0) {
				System.out.println(name+"is waiting.");
				try {
					wait();
					Thread.sleep(500);
					}catch (Exception e) {}
			}
			while(true) {
			for(int i=0; i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				notify();
				return;
				}
			}
			try {
				System.out.println(name + "is waiting.");
				wait();
				Thread.sleep(500);
			} catch (Exception e) {
			}
			
		}
	
	}
}
	public int disNum() {return dishNames.length;}
}

public class Ex_15 {

	public static void main(String[] args) throws Exception{
		Table2 table = new Table2();
		
		new Thread(new Cook2(table),"Cook").start();
		new Thread(new Customer2(table, "dount"),"CUST1").start();
		new Thread(new Customer2(table, "burger"),"CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
		
	}

}
