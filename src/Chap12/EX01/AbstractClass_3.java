package Chap12.EX01;

// 추상 클래스는 객체화 할 수 없다
abstract class D { 		// 클래스 내부에 추상 메소드가 올 경우 abstract 클래스가 되어야 한다.
						// 자식 클래스에서 반드시 오류 없이 메소드를 재정의 하는것을 보장
	
	abstract void print(); 		// 추상 메소드, 구현부가 없고 선언만 된 메소드
}

class E extends D { 	// 자식 클래스는 추상클래스의 메소드를 재정의 .
	@Override
	void print() {
		System.out.println("E 클래스의 print()");
	}
}

public class AbstractClass_3 {

	public static void main(String[] args) {
		// 1. 객체화 해서 출력. (객체 3개 생성 후 print() 매서드 출력
			// 매번 자주 사용하는 경우 
			D d1 = new E();
			D d2 = new E();
			D d3 = new E();
			
			d1.print();
			d2.print();
			d3.print();
		
			System.out.println("==================");
		// 2. 익명 클래스를 생성 해서 출력 (print() 매서드 3번 출력
			// 객체 생성 없이 임시로 사용하는 경우
			D d4 = new D() {
				// D 추상 클래스의 자식 클래스 영역(익명 클래스)
				void print() {
					System.out.println("익명 클래스로 생성");
				}
			};
			D d5 = new D() {
				void print() {
					System.out.println("익명 클래스로 생성");
				}
			};
			D d6 = new D() {
				void print() {
					System.out.println("익명 클래스로 생성");
				}
			};
			
			d4.print();
			d5.print();
			d6.print();
	}

}