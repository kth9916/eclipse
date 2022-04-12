package Chap13.EX08;

// 클래스 정의 및 참조 변수를 사용 / 미사용인 경우 매개변수로 객체를 전달

interface A{
	public abstract void abc();
}

//1. 자식 클래스를 직접 생성
class B implements A{
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}

class C{		// cde 메소드에 인풋값으로 A타입의 객체 a를 받는다.
	void cde(A a) { 	// cde를 호출하면서 매개변수로 A타입의 객체를 전송
		a.abc();
	}
}

public class AnonimousClass_3 {

	public static void main(String[] args) {
		// 첫 번쨰 방법 : 클래스명 O + 참조 변수명 O
		C c = new C(); 		
		
		A a = new B(); 	// 참조 변수 생성
		
		c.cde(a); 	// 매개변수에 객체 a를 생성해서 던져줌
		
		System.out.println("======================");
		
		// 두 번째 방법 : 클래스 명 O + 참조변수명 X
		c.cde(new B());
	}

}
