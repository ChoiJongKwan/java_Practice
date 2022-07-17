package MemberProject;

import java.util.*;

public class MemberManegement {
	ArrayList<Member> members = new ArrayList<>();

	public void newMember(String name, int age, String phoneNumber) {
		if(findPhoneNumber(phoneNumber)) {
			Member member = new Member(name,age,phoneNumber);
			members.add(member);
		}
	}

	public boolean findPhoneNumber(String phoneNumber) {
		for(int i=0; i<members.size();i++) {
			if(phoneNumber.equals(members.get(i).getPhoneNumber()))
				return false;
		}
		return true;		
	}

	public void deleteMember(String phoneNumber) {
		if (phoneNumber.equals(phoneNumber)) {
			for(int i=0; i<members.size();i++) {
				if(phoneNumber.equals(members.get(i).getPhoneNumber()))
					members.remove(i);
			}
		}
	}

	public void updateMember(String phoneNumber,int age,String name) {
		int i=0;
		for( i=0; i<members.size();i++) {
			if(phoneNumber.equals(members.get(i).getPhoneNumber())) 
				break;
			}
		members.get(i).setAge(age);	
		members.get(i).setName(name);	
	}
	
	public void showMember() {
		for(Member a :members) {
			System.out.println(a.getName()+","+a.getAge()+","+a.getPhoneNumber());
			
		}
	}

}

