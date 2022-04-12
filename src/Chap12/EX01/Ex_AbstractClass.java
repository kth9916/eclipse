package Chap12.EX01;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("�߿�");
	}
	
	@Override
	void fly() {
		System.out.println("����̴� �ϴ��� ���� ���Ѵ�.");
	}
}

class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("����");
	}
	@Override
	void fly() {
		System.out.println("�������� �ϴ��� ����");
	}
}

public class Ex_AbstractClass { 		// 

	public static void main(String[] args) {
		// 1. �ڽ� ��ü Cat, Eagle Ŭ������ ���� �� ���
		Abc ac = new Cat();
		Abc ae = new Eagle();
		
		Abc[] arr1 = {ac,ae};
		for(int i = 0; i < arr1.length; i++) {
			arr1[i].cry();
			arr1[i].fly();
			System.out.println("===============");
		}
		
		// 2. �͸� Ŭ���� ���� �� ���, 
		Abc tiger = new Abc() {
			void cry() {
				System.out.println("����");
			}
			void fly() {
				System.out.println("ȣ���̴� ���� ���Ѵ�");
			}
		};
		
		tiger.cry();
		tiger.fly();
	}

}
