package chap18.EX06;

interface A{
	void abc(B b, int k); 		// 이미 호출할 때 b라는 객체를 만들어서 던져줌
}

class B{
	void bcd(int k) { 				// 인스턴스 메소드
		System.out.println(k);
	}
}

public class RefOfInstanceMethod_Type_2_1 {

	public static void main(String[] args) {
		// 인스턴스 메소드 참조 Type2
		// 익명 이너클래스
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// 람다식 표현
		A a2 = (B b, int k) -> {b.bcd(k);};
		
		// 인스턴스 메소드 참조
		A a3 = B::bcd; 				// <== 인스턴스 메소드이나 B객체를 인풋 받아서 bcd 메소드 호출
			// 1. 객체명::메소드명;
			// B(대문자) - 정적 메소드 호출일 때, 인스턴트 메소드 호출이지만, 매개변수로 객체가 인풋 값으로 들어갈 때.
		
		B b = new B();
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
	}

}
