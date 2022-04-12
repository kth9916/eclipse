package Chap13.EX09.EX1;

interface A {
	void cry();
	void fly();
}

class C {
	void abc (A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		C c = new C();
		// 1. 클래스는 존재 (X) + 참조변수 (O)
		A a = new A() { 		// 참조 변수 a 생성
			@Override
			public void cry() {
				System.out.println("야옹하고 웁니다 : 클래스는 존재 (X) + 참조변수 (O)");
			}
			@Override
			public void fly() {
				System.out.println("펄럭하고 납니다 : 클래스는 존재 (X) + 참조변수 (O)");
			}
		};
		c.abc(a);
		
		System.out.println("===================================================");
		// 2. 클래스는 존재 (X) + 참조변수 (X)
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("쿠르릉하고 웁니다 : 클래스 존재(X) + 참조변수 (X)");
			}
			@Override
			public void fly() {
				System.out.println("슈우웅하고 납니다 : 클래스 존재(X) + 참조변수 (X)");
			}
		});
		
	}

}
