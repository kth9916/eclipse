package Chap13.EX04; // 어렵다 // 

// 지역 이너클래스 : 클래스의 메소드 내부에 선언된 클래스
	// 메서드 내부의 필드는 final 키가 생략됨. 값을 수정 불가
	// 지역 이너 클래스에서 사용되는 지역 변수는 자동으로 final로 선언. 생략시 컴파일러가 자동으로 할당해 줌

class A {
	int a = 3; 		// 필드 : Heap, 반드시 초기화가 강제로 진행됨
					// 필드의 초기값을 할당 후에 값을 수정할 때는 객체화 해서 값을 수정
	A(){}				// 생성자나 setter를 통해서 초기값을 할당 후에 객체를 생성
	A(int a){		// 생성자를 통해서 a의 초기값 할당
		this.a=a;
	}
	public void setA(int a) { 		// setter를 통해서 필드의 값을 초기화
		this.a = a;
	}
	
	void ccc() { 	// 지역 변수  : 메서드 내부의 변수, 메모리의 스택공간에 저장
		int a = 3; 		// 지역 변수 초기 값 3 할당
		a = 4;			// a 변수의값을 4로 변경
		a = 10;			//a 변수의 값을 10으로 변경
		int b;
		b = 0;
		
		System.out.println(a); 		//
		System.out.println(b);		// b는 초기값을 할당하지 않았음
	}
	
	
	void abc() {
		int b = 5; 	// 지역변수 : 메소드 내부에 선언된 변수가 지역 이너 클래스에서 사용되면 final이 컴파일러에 의해서 할당됨
//		int b = 10;	
		int c = 10;	// 지역 이너 클래스에서 사용되지 않으면 final이 붙지 않음.
			c = 20; // 자동으로 final 키가 컴파일러에 의해서 자동으로 할당
		class B{	// 지역 이너 클래스
			void bcd() {
				System.out.println(a); 	// 필드
				System.out.println(b); 	// 지역변수 : final이 생략됨. 수정 불가
				a = 5;		// 필드는 값 수정이 가능
//				b = 7; 		// 지역클래스 내부에 선언된 지역변수는 자동으로 final 키가 컴파일러에 의해서 할당됨
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class InnerClass_4_difficult {

	public static void main(String[] args) {
		// 1. 객체를 생성 후 메소드 호출
		 A a = new A();
		 a.abc();
	}

}
