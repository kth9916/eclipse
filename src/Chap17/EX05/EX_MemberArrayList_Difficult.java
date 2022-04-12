package Chap17.EX05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Member{ 				// DTO, VO : 각 계층 간에 데이터를 받아서 
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) { 		// 생성자를 통해서 필드의 값 할당
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
			return memberName + " 회원님의 아이디는 " + memberId + "입니다. ";
		}
	
}

class MemberArrayList{ 		// MemberArrayList를 객체화하면 ArrayList 객체가 생성 된다.
	private ArrayList<Member> arrayList;
	
	// List<Member> aList = new ArrayList<Member>(); 		// 제너릭 타입클래스 객체 생성
	// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() { 		// 기본 생성자
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) { 		// Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) { 			// 매개 변수 2개를 받아서 특정 index 방 번호에 값을 추가(add)
		try {
		arrayList.add(a, member);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("예외가 발생되었습니다. 방번호를 정확하게 입력하세요. ");
		}
	}
	public boolean removeMember(int memberId) { 		// 이 식은 훌륭하다.
			// Array List에 저장된 memberId를 검색해서 해당 객체를 삭제하는 메소드
			
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); 		// 각 방에 저장된 Member 객체를 member 참조변수에 할당
			int tempid = member.getMemberId();		// 객체의 getMemberId(), 객체 내부의 memberId
			
//			if(arrayList.get(i).getMemberId() == memberId) {
//				arrayList.remove(i);
//				System.out.println("아이디 : " +  memberId +"를 삭제했습니다.");
//				return true;
//			}
			
			if(tempid == memberId) {
				arrayList.remove(i);
				System.out.println("회원님의 " + memberId + "는 삭제 되었습니다. ");
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
			// ArrayList에 저장된 모든 사용자 정보를 추력하는 메소드
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
			// 객체를 생성하는 순간 arrayList 필드가 활성화
		 	// 메소드 호출하기 위해서 객체 생성.
			// addMember(), addMember2(), removeMember(), showAllMember()
		
		
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손지원");
		Member memberPark = new Member(1003, "박지원");
		Member memberHong = new Member(1004, "홍지원");
		
		memberArrayList.addMember(memberLee); 	// 각 객체를 생성해서 ArrayList에 저장
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 
		memberArrayList.showSize();
		
		// 특정 index방에 사용자 추가
		memberArrayList.addMember2(3, memberLee);
				
		// 모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
		System.out.println();
		// 특정 Id를 갖고 있는 멤버 삭제
		memberArrayList.removeMember(1003);
		
		
	}
}
