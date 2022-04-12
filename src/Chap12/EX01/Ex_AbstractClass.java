package Chap12.EX01;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("야옹");
	}
	
	@Override
	void fly() {
		System.out.println("고양이는 하늘을 날지 못한다.");
	}
}

class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("피융");
	}
	@Override
	void fly() {
		System.out.println("독수리는 하늘을 난다");
	}
}

public class Ex_AbstractClass { 		// 

	public static void main(String[] args) {
		// 1. 자식 객체 Cat, Eagle 클래스를 생성 후 출력
		Abc ac = new Cat();
		Abc ae = new Eagle();
		
		Abc[] arr1 = {ac,ae};
		for(int i = 0; i < arr1.length; i++) {
			arr1[i].cry();
			arr1[i].fly();
			System.out.println("===============");
		}
		
		// 2. 익명 클래스 생성 후 출력, 
		Abc tiger = new Abc() {
			void cry() {
				System.out.println("어흥");
			}
			void fly() {
				System.out.println("호랑이는 날지 못한다");
			}
		};
		
		tiger.cry();
		tiger.fly();
	}

}
