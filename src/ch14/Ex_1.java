package ch14;
@FunctionalInterface
interface MYFunction{
	void run();
}



public class Ex_1 {
	static void execute(MYFunction f) {
		f.run();
	}
	static MYFunction getMyFunction() {
		MYFunction f = () -> System.out.println("f3. run()");
		return f;
	}
	
	
	public static void main(String[] args) {
		MYFunction f1 =()-> System.out.println("f1.run()");
		
		MYFunction f2= new MYFunction() {
		public void run(){
			System.out.println("f2.fun()");
		}		
	};
		MYFunction f3 = getMyFunction();
		f1.run();
		f2.run();
		f3.run();
		execute(f1);
		execute(()-> System.out.println("run()") );
	
	}

}
