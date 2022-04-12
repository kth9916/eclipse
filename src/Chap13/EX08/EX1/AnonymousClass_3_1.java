package Chap13.EX08.EX1;

// 3. 메소드의 매개 변수로 전달 :
// 3-1 : 객체 생성 후 매개 변수로 전달 (클래스명 O, + 참조변수 O)
// 3-2 : 객체 생성 후 매개 변수로 전달 (클래스명 O, + 참조변수 X)


interface A{	// 인터페이스, 추상메소드를 정의,
	public abstract void cry(); 	// 추상메소드, public abstract
	void fly();
}

class B implements A { 	 // B는 A인터페이스를 구현한 클래스
	@Override
	public void cry() {System.out.println("멍멍 : 매개 변수 전달 후 출력");}
	
	@Override
	public void fly() {System.out.println("날지못합니다 : 매개 변수 전달 후 출력");}
}

class C {	// C 객체의 abc 메소드 호출시 A 타입을 매개변수로 받는다.
	void abc(A a) { 	// 하위 자식 클래스가 매개변수로 들어올 경우 A 타입으로 자동으로 업캐스팅이 된다
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_3_1 {

	public static void main(String[] args) {
		C c = new C();
		// 1. 클래스가 존재 O + 참조 변수 : O
		A a = new B(); 		// B를 객체화 해서 A 타입으로 생성, a : 참조 변수
		
		c.abc(a);
		
		// 2. 클래스가 존재 O + 참조 변수 : X
		
		c.abc(new B());
	}

}
