package Chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet���� ��ȯ
// Member Ŭ������ memberId �÷��� equals() �������̵�, hashCode() �������̵� �������ؼ� ������ ��ü�� �ν�

// �߿� : Set�� �ߺ��� ���� ������ �� ����
	// Wrapper Ŭ������ Integer,  Double, Float, Character, Byte, Short, Boolean,
	// Wrapper Ŭ������ equals(), hashCode() �޼ҵ尡 ������ �Ǿ� �ִ�.
	// Ư�� ��ü�� ���� �� �� ��ü�� Set�� ������ ��� �� ��ü�� Object Ŭ������ equals(), hashCode()�� ������ �� ����Ѵ�.
	// ��ü�� Ư�� �ʵ��� ���� ���� �� �ߺ��� �ĺ��ϴ� �ʵ带 ����.



class Member{ 				// DTO, VO : �� ���� ���� �����͸� �޾Ƽ� 
	private int memberId; 		// Set�� ���� �ĺ���, memberId �ʵ��� ���� ���� �� ���� ��ü�̴ٶ�� ����
								// equals(), hashCode()
	private String memberName;
	
	public Member(int memberId, String memberName) { 		// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	 @Override
		public String toString() {
			return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�. ";
		}
	 @Override 				// member1.equals(member2)
		public boolean equals(Object obj) { 	// ��ü�� ������ Object�� ��ĳ����
			if(obj instanceof Member) { 		// �ٿ�ĳ������ �� ��Ÿ�� ������ �����Ϸ���, Object�� Member ��ü�� ���ԵǾ� ���� �� �ٿ�ĳ����
				Member member = (Member)obj; 	// obj�� Object�� ��ĳ���� �Ǿ �ٿ� ĳ����
				if(this.memberId == member.memberId) { 		// this.memberId : member1 ��ü��, member.memberId : member2
					return true;
				} else {
					return false;
				}
			}
			return false; 		// obj�� Member Ÿ���� �������� ���� ��
		}
	 @Override
		public int hashCode() {			// �ʵ��� ���� ������ �� ������ hashCode�� ����.
			// return memberId; 		// this.memberId
		 	//return this.memberId; 	// �ϳ��� �ʵ常�� �������� hashCode()  ����
		 	return Objects.hashCode(memberId); 	// ���� ����
		 			// Objects.hashCode(memberid, memberName); �������� �ʵ带 �������� hashCode�� ������ �� �ִ�.
		 				// memberId, memberName �ʵ��� ���� ��� ������ ��� ������ hashCode();
		}
	 	
	 
	
}

class MemberHashSet{ 		// MemberhashSet�� ��üȭ�ϸ� hashSet ��ü�� ���� �ȴ�.
	private Set<Member> hashSet; 	// Set ���� : <Member> 	, �ʵ��� private(������, setter)
	
		// Set<Member> hashSet = new HashSet<Member>
	
	public MemberHashSet() { 		// �⺻ ������ ȣ��� Set�� �������� Ȱ��ȭ.
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) { 		// Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ�
		hashSet.add(member); 		// Member ��ü�� ��ǲ �޾� hashSet�� member ��ü�� ����, �ߺ� ����Ǹ� �ȵȴ�.
									// Member ��ü�� memberId �ʵ��� ���� ������ ���, ������ ��ü�̴ٶ�� ����
									// equals(), hashCode() �޼ҵ� ������ : memberId, 
	}
	public boolean removeMember(int memberId) { 		// memberId�� Member ��ü ���� �ʵ��̹Ƿ� Set�� ����� ��ü�� �����;��Ѵ�.
		//  Set�� index�� �������� �����Ƿ� �⺻ for ���� ����� �� ����.
		// ���� for ���� ����� �� �ְ�, iterator�� ����� �� �ִ�.
		// iterator ����ؼ� remove
		
		Iterator<Member> iterator1 = hashSet.iterator(); 		// iterator : ��ȸ��, 
		while (iterator1.hasNext()) { 			// hashSet�� ���� ������ �� true
			Member member = iterator1.next(); 	// next(); ���� �����ְ� ���� ������ �̵�.
			int tempid = member.getMemberId();
			
			if(tempid == memberId) {
				hashSet.remove(member);
				System.out.println(tempid + "�� �����Ǿ����ϴ�.");
				return true;
			}
		}
		
		System.out.println("���̵� �������� �ʽ��ϴ�.");
		return false;
	}


	public void showAllMember() {
		Iterator<Member> iterator1 = hashSet.iterator();
		while(iterator1.hasNext()) {
			Member member = iterator1.next(); 			// hashSet�� ���� ������ �´�
			System.out.print(member); 	// hashSet�� ��ü�� ���
		}
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class EX_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet(); 	

		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "������");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ����");
		Member memberLee2 = new Member(1001, "������");
		
		memberHashSet.addMember(memberLee); 	// �� ��ü�� �����ؼ� hashSet�� ����
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		// ������ ���
		memberHashSet.showSize(); 	// 4�� ���
		
		// Ư�� Id�� ���� �ִ� ��� ����
		memberHashSet.removeMember(1003);	
		
		// ��� ����� ���� ���
		memberHashSet.showAllMember();
		


	}
}
