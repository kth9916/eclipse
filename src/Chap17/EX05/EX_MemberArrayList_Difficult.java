package Chap17.EX05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Member{ 				// DTO, VO : �� ���� ���� �����͸� �޾Ƽ� 
	private int memberId;
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
	
}

class MemberArrayList{ 		// MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� ���� �ȴ�.
	private ArrayList<Member> arrayList;
	
	// List<Member> aList = new ArrayList<Member>(); 		// ���ʸ� Ÿ��Ŭ���� ��ü ����
	// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() { 		// �⺻ ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) { 		// Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ�
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) { 			// �Ű� ���� 2���� �޾Ƽ� Ư�� index �� ��ȣ�� ���� �߰�(add)
		try {
		arrayList.add(a, member);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ȣ�� ��Ȯ�ϰ� �Է��ϼ���. ");
		}
	}
	public boolean removeMember(int memberId) { 		// �� ���� �Ǹ��ϴ�.
			// Array List�� ����� memberId�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ�
			
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); 		// �� �濡 ����� Member ��ü�� member ���������� �Ҵ�
			int tempid = member.getMemberId();		// ��ü�� getMemberId(), ��ü ������ memberId
			
//			if(arrayList.get(i).getMemberId() == memberId) {
//				arrayList.remove(i);
//				System.out.println("���̵� : " +  memberId +"�� �����߽��ϴ�.");
//				return true;
//			}
			
			if(tempid == memberId) {
				arrayList.remove(i);
				System.out.println("ȸ������ " + memberId + "�� ���� �Ǿ����ϴ�. ");
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
			// ArrayList�� ����� ��� ����� ������ �߷��ϴ� �޼ҵ�
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
	}
	public void showSize() {
		System.out.println(arrayList.size());
	}
}

public class EX_MemberArrayList_Difficult {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList(); 	
			// ��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
		 	// �޼ҵ� ȣ���ϱ� ���ؼ� ��ü ����.
			// addMember(), addMember2(), removeMember(), showAllMember()
		
		
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "������");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ����");
		
		memberArrayList.addMember(memberLee); 	// �� ��ü�� �����ؼ� ArrayList�� ����
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 
		memberArrayList.showSize();
		
		// Ư�� index�濡 ����� �߰�
		memberArrayList.addMember2(3, memberLee);
				
		// ��� ����� ���� ���
		memberArrayList.showAllMember();
		
		System.out.println();
		// Ư�� Id�� ���� �ִ� ��� ����
		memberArrayList.removeMember(1003);
		
		
	}
}
