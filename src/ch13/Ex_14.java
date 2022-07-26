package ch13;

import java.util.ArrayList;

class Customer implements Runnable{
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table=table;
		this.food=food;
	}
	public void run() {
		while(true) {
			try {Thread.sleep(10);} catch (Exception e) {}
			String name= Thread.currentThread().getName();
			if(eatFood()) {
				System.out.println(name+"ate a "+food);
			}else {
				System.out.println(name+" failed to eat. :(");
			}
		}
	}
	boolean eatFood() {return table.remove(food);}
	
}
class Cook implements Runnable{
	private Table table;
	Cook(Table table){this.table=table;}
	public void run() {
		while(true) {
			int idx= (int)(Math.random()*table.disNum());
			table.add(table.dishNames[idx]);
			try {Thread.sleep(100);}catch(InterruptedException e){}
		}
	}
}
class Table{
	String[] dishNames= {"dount", "dount","burger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes= new ArrayList<>();
	public synchronized void add(String dish) {
		if(dishes.size()>=MAX_FOOD) return;
		dishes.add(dish);
		System.out.println("Dishes : "+dishes.toString());
	}
	public boolean remove(String dishName) {
		synchronized (this) {
			while(dishes.size()==0) {
				String name = Thread.currentThread().getName();
				System.out.println(name+"is waiting.");
				try {Thread.sleep(500);}catch (Exception e) {}
			}
			for(int i=0; i<dishes.size();i++) {
				dishes.remove(i);
				return true;
			}
			
		}
		return false;
	}
	public int disNum() {return dishNames.length;}
}
public  class Ex_14 {
	public static void main(String[] args) throws Exception{
		Table table = new Table();
		new Thread(new Cook(table),"Cook").start();
		new Thread(new Customer(table, "dount"),"CUST1").start();
		new Thread(new Customer(table, "burger"),"CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
		
	}
}
