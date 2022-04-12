package Chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet으로 변환
// Member 클래스의 memberId 컬럼을 equals() 오버라이딩, hashCode() 오버라이딩 재정의해서 동일한 객체로 인식

// 중요 : Set은 중복된 값을 저장할 수 없다
	// Wrapper 클래스는 Integer,  Double, Float, Character, Byte, Short, Boolean,
	// Wrapper 클래스는 equals(), hashCode() 메소드가 재정의 되어 있다.
	// 특정 객체를 생성 후 그 객체를 Set에 저장할 경우 그 객체의 Object 클래스의 equals(), hashCode()를 재정의 해 줘야한다.
	// 객체의 특정 필드의 값이 같을 때 중복을 식별하는 필드를 생성.



class Member{ 				// DTO, VO : 각 계층 간에 데이터를 받아서 
	private int memberId; 		// Set에 넣을 식별자, memberId 필드의 값이 같을 때 같은 객체이다라고 선언
								// equals(), hashCode()
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
	 @Override 				// member1.equals(member2)
		public boolean equals(Object obj) { 	// 객체의 정보가 Object로 업캐스팅
			if(obj instanceof Member) { 		// 다운캐스팅할 때 런타임 오류를 방지하려면, Object에 Member 객체가 포함되어 있을 때 다운캐스팅
				Member member = (Member)obj; 	// obj는 Object로 업캐스팅 되어서 다운 캐스팅
				if(this.memberId == member.memberId) { 		// this.memberId : member1 객체의, member.memberId : member2
					return true;
				} else {
					return false;
				}
			}
			return false; 		// obj가 Member 타입을 내포하지 않을 때
		}
	 @Override
		public int hashCode() {			// 필드의 값이 동일할 때 동일한 hashCode를 생성.
			// return memberId; 		// this.memberId
		 	//return this.memberId; 	// 하나의 필드만을 조건으로 hashCode()  생성
		 	return Objects.hashCode(memberId); 	// 권장 사항
		 			// Objects.hashCode(memberid, memberName); 여러개의 필드를 조건으로 hashCode를 생성할 수 있다.
		 				// memberId, memberName 필드의 값이 모두 동일할 경우 동일한 hashCode();
		}
	 	
	 
	
}

class MemberHashSet{ 		// MemberhashSet를 객체화하면 hashSet 객체가 생성 된다.
	private Set<Member> hashSet; 	// Set 선언 : <Member> 	, 필드의 private(생성자, setter)
	
		// Set<Member> hashSet = new HashSet<Member>
	
	public MemberHashSet() { 		// 기본 생성자 호출시 Set의 참조변수 활성화.
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) { 		// Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드
		hashSet.add(member); 		// Member 객체를 인풋 받아 hashSet에 member 객체를 저장, 중복 저장되면 안된다.
									// Member 객체의 memberId 필드의 값이 동일할 경우, 동일한 객체이다라고 정의
									// equals(), hashCode() 메소드 재정의 : memberId, 
	}
	public boolean removeMember(int memberId) { 		// memberId는 Member 객체 내의 필드이므로 Set에 저장된 객체를 가져와야한다.
		//  Set은 index가 존재하지 않으므로 기본 for 문은 사용할 수 없다.
		// 향상된 for 문을 사용할 수 있고, iterator를 사용할 수 있다.
		// iterator 사용해서 remove
		
		Iterator<Member> iterator1 = hashSet.iterator(); 		// iterator : 순회자, 
		while (iterator1.hasNext()) { 			// hashSet에 값이 존재할 때 true
			Member member = iterator1.next(); 	// next(); 값을 던져주고 다음 값으로 이동.
			int tempid = member.getMemberId();
			
			if(tempid == memberId) {
				hashSet.remove(member);
				System.out.println(tempid + "가 삭제되었습니다.");
				return true;
			}
		}
		
		System.out.println("아이디가 존재하지 않습니다.");
		return false;
	}


	public void showAllMember() {
		Iterator<Member> iterator1 = hashSet.iterator();
		while(iterator1.hasNext()) {
			Member member = iterator1.next(); 			// hashSet의 값을 가지고 온다
			System.out.print(member); 	// hashSet의 객체를 출력
		}
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class EX_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet(); 	

		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손지원");
		Member memberPark = new Member(1003, "박지원");
		Member memberHong = new Member(1004, "홍지원");
		Member memberLee2 = new Member(1001, "이지원");
		
		memberHashSet.addMember(memberLee); 	// 각 객체를 생성해서 hashSet에 저장
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		// 사이즈 출력
		memberHashSet.showSize(); 	// 4개 출력
		
		// 특정 Id를 갖고 있는 멤버 삭제
		memberHashSet.removeMember(1003);	
		
		// 모든 사용자 정보 출력
		memberHashSet.showAllMember();
		


	}
}
