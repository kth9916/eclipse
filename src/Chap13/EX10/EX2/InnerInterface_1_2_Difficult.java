package Chap13.EX10.EX2;

import Chap13.EX10.EX2.Abc.Def;

class Abc {		
	
	// 1. 객체 생성 후 객체에 직접 값 할당 (d1)
	// 2. 생성자를 통해서 값 할당 (d2)
	// 3. settter 통해서만 가능하다. (d3)
	
				// 필드 블락
	Def d; 		// 내부에서는 Def 타입이지만, 외부에서는 Abc.Def 타입이다.
				
				
	
	Abc(){}		// 생성자 블락 / 
	Abc(Def d){ 		// 생성자를 통해서 값 할당 / Def 라는 타입의 객체를 받아서 메모리에 로드
		this.d = d;
	}
	
	void setDef (Def d) { 	// setter를 통해서 필드의 기본값 할당
		this.d = d;
	}
	
	interface Def { 	// ABC.Def
		void run ();
		void fly ();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
		
}

public class InnerInterface_1_2_Difficult {

	public static void main(String[] args) {
		// 1. 객체 생성 후 필드에 값을 할당
		Abc a1 = new Abc();
		a1.d = (Abc.Def) new Abc.Def() { 	//  Abc.Def라는 타입의 자식 객체 a1에 넣고 출력. 
			
			@Override
			public void run() {
				System.out.println("개는 달린다.");
			}
			
			@Override
			public void fly() {
				System.out.println("개는 날지 못한다.");
			}
		};
		a1.ghi();
		
		System.out.println("=========================================");
		// 2. 생성자를 이용해서 값을 할당
		Abc a2 = new Abc(
				new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("고양이는 달린다.");
			}
			
			@Override
			public void fly() {
				System.out.println("고양이는 날지 못한다.");
			}
		});
		
		a2.ghi();
		
		System.out.println("=========================================");
		// 3. setter를 통해서 값을 할당
		Abc a3 = new Abc();
		a3.setDef(new Abc.Def() { 		// Abc.Def ??? (이너 인터페이스 타입의 매개변수) = new Abc.Def();
			
			@Override
			public void run() {
				System.out.println("독수리는 달리지 못한다.");
			}
			
			@Override
			public void fly() {
				System.out.println("독수리는 날수 있다.");
			}
		});
		
		a3.ghi();
}
}
