package day07;
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
public class Test01_객체배열 {
	public static void main(String[] args) {
		Member mem= new Member("asdf", "1234");
		System.out.println("id: "+mem.getId());
		System.out.println("pwd: "+mem.getPwd());
		System.out.println();
		
		Member[] mm= new Member[3];
		mm[0]=new Member("admin", "12345");
		mm[1]=new Member("cjk", "1111");
		mm[2]=new Member("user1", "2222");
		for(int i=0;i<mm.length;i++) {
			System.out.println("회원아이디: "+mm[i].getId());
			System.out.println("비밀번호: "+mm[i].getPwd());
			System.out.println();
		}
	}
}
