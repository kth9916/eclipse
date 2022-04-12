package Chap11.EX06;

abstract class Animal { 	// 추상 클래스 : 추상 메소드가 하나 이상 포함되어 있는 경우 / 추상 클래스는 객체 생성 불가, 타입은 사용 가능
								// 자식클래스는 부모 클래스의 메소드를 구현시 오류를 방지
								// 추상 클래스는 추상 클래스 내의 추상메소드를 자식 클래스에서 반드시 구현하도록 보장 받는다
	String name;
	int age;
	

	abstract void cry(); 		// 추상 메소드 : 구현부가 없는 메소드
		// void cry() {}  	<== 일반 메소드 : 리턴타입 메소드이름 (입력매개변수) {구현코드}
	abstract void run();
	
	@Override
		public String toString() {
			return "이름 : " + name + " , 나이" + age;
		}
}
class Cat extends Animal { 			// Cat은 Animal 상속 일부만 상속한 경우
	
	Cat(String name, int age){
		super.name = name;
		super.age = age;		
	}
	
	@Override
	void cry() {
		System.out.println("고양이는 야옹하고 운다");
		
	}
	
	@Override
	void run() {
		System.out.println("고양이는 껑충하고 뜁니다. ");
	}

	
}

class Tiger extends Animal { 		// Tiger는 Animal 상속 모두 한 경우 , 콘크리트 클래스

	Tiger(String name, int age){
		super.name = name;
		super.age = age;		
	}
	
	@Override
	void cry() {
		System.out.println("호랑이는 어흥하고 운다");
	}

	@Override
	void run() {
		System.out.println("호랑이는 힘차게 달립니다. ");
	}
	
}

class Eagle extends Animal {

	Eagle(String name, int age){
		super.name = name;
		super.age = age;		
	} 
	
	@Override
	void cry() {
		System.out.println("독수리는 끼오하고 운다");
	}

	@Override
	void run() {
		System.out.println("독수리는 날개로 난다");
	}
	
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Eagle("독수리",15);
		
		// 1. Animal 배열 객체에 저장 후 
		
		Animal[] arr1 = {a1,a2,a3};
		
		System.out.println("======== for 문 ========================================");
		// 2. for 문을 사용해서 객체를 출력시 이름과 나이를 출력 , cry(), run()
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("이름 : " + arr1[i].name + ", 나이 : " + arr1[i].age);
			arr1[i].cry();
			arr1[i].run();
			System.out.println("======================");
		}
		System.out.println("======= 향상된 for 문 =============================");
		// 3. Enhanced For 문을 사용해서 이름과 나이를 출력 , cry(), run()
		for(Animal k : arr1) {
			System.out.println("이름 : " + k.name + ", 나이 : " + k.age);
			k.cry();
			k.run();
			System.out.println("======================");
		}
	}

}
