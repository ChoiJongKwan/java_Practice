package day06;
class Member{
	private String id;
	private String pwd;
	
	public Member(String id ,String pwd) {
		this.id=id;
		this.pwd=pwd;
		
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	
	
}
public class Test09 {
	public static void main(String[] args) {
		Member mem=new Member("asdf", "1234");
		System.out.println(mem.getId());
		System.out.println(mem.getPwd());
	}
}
