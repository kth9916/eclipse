package Chap10.EX05;

class A {
	A (){}
	// 인스턴스 메소드 : 상속관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩된다.
		// 상속관계에서 인스턴스 필드, static 필드, static 메소드는 오버라이딩 되지 않습니다.
		// 오버라이딩 할 때는 시그니처가 같아야 한다. 리턴타입, 메소드명, 매개변수 타입, 매개변수 갯수 
	
	void print() {
		System.out.println("Class A 출력");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("Class B 출력");
	}
}

class C extends A{
	@Override
	void print() {
		System.out.println("Class C 출력");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// 1. A 타입, A 생성자
		A a = new A();
		a.print();
		// 2. B 타입, B 생성자
		B b = new B();
		b.print();
		// 3. C 타입, C 생성자
		C c = new C();
		c.print();
		
		// 4. A 타입, B 생성자 ( 오버라이딩 되어 A의 print() 호출시, B의 print()가 작동된다 )
		A ab = new B();
		ab.print(); 		// A의 print() 메소드 호출 ===> B의 print()가 출력됨.
		
		A ac = new C();
		ac.print();
		
		System.out.println("========= For ===========");
		A[] arr = {ab, ac} ; 	// 배열에 A 타입의 객체를 저장
		
		for ( int i = 0; i < arr.length ; i++) {
			arr[i].print();
		}
		System.out.println("======= Enhanced For =======");
		for (A k : arr) {
			k.print();
		}

	}

}
