package ch13;

import javax.swing.JOptionPane;

public class Ex_5 {

	public static void main(String[] args) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신값은" + input + "입니다.");
		
	}

}
class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i=10 ;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
}