package ch13;

public class Ex_11 {
	static long startTime=0;
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime	= System.currentTimeMillis();
		try {
			th1.join();
			th2.join();
		} catch (Exception e) {}
		System.out.println("소요시간 :"+(System.currentTimeMillis()-startTime));
	}

}
class ThreadEx11_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++)
			System.out.println("-");
	}
}
class ThreadEx11_2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++)
			System.out.println("|");
	}
}