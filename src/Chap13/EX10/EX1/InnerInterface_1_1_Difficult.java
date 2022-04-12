package Chap13.EX10.EX1;

class A {
	B b ; 		// B : 인터페이스 타입, b : 참조 변수 : 값을 할당하는 방법
				// b : null
					// 1. 객체 생성 후 값을 할당하는 방법
					// 2. 생성자를 통해서 값을 할당
					// 3. setter를 통해서 값을 할당
	
	A (){} // 기본 생성자
	A(B b){
		this.b = b;
	}
	
	public void setB (B b) {
		this.b = b;
	}
	
	interface B {
		void play();
		void stop();
	}
	
	void abc () { 		// play(); 재정의, stop(); 재정의
		b.play();
		b.stop();
	}
	
}

public class InnerInterface_1_1_Difficult {

	public static void main(String[] args) {
		A button3 = new A(); 			// A button3
		button3.setB(new A.B() {
			
			@Override
			public void stop() {
				System.out.println("버튼을 누르면 멈춘다. ");
			}
			
			@Override
			public void play() {
				System.out.println("버튼을 누르면 재생된다. ");
			}
		});
		
		button3.abc();
		
		System.out.println("==============================================");
		
		// 1. 객체 생성 후 필드의 값을 할당
		A a1 = new A();
		
		a1.b = (A.B) new A.B() { 
			public void play() {
				System.out.println("짹짹");
				
			};
			public void stop() {
				System.out.println("새는 하늘을 납니다");
			};
		}; 
		a1.abc();
		
		System.out.println("========================================");
		
		// 2. 생성자를 이용해서 값을 할당
		A a2 = new A(
				new A.B() {
					
					@Override
					public void stop() {
						System.out.println("멍멍");
					}
					
					@Override
					public void play() {
						System.out.println("개는 하늘을 날지 못합니다.");
					}
				}
					); 		// 생성자 내부에 A,B 타입의 객체 생성 후 주입
		a2.abc();

	}

}
