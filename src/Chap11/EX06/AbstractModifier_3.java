package Chap11.EX06;

abstract class Animal { 	// �߻� Ŭ���� : �߻� �޼ҵ尡 �ϳ� �̻� ���ԵǾ� �ִ� ��� / �߻� Ŭ������ ��ü ���� �Ұ�, Ÿ���� ��� ����
								// �ڽ�Ŭ������ �θ� Ŭ������ �޼ҵ带 ������ ������ ����
								// �߻� Ŭ������ �߻� Ŭ���� ���� �߻�޼ҵ带 �ڽ� Ŭ�������� �ݵ�� �����ϵ��� ���� �޴´�
	String name;
	int age;
	

	abstract void cry(); 		// �߻� �޼ҵ� : �����ΰ� ���� �޼ҵ�
		// void cry() {}  	<== �Ϲ� �޼ҵ� : ����Ÿ�� �޼ҵ��̸� (�Է¸Ű�����) {�����ڵ�}
	abstract void run();
	
	@Override
		public String toString() {
			return "�̸� : " + name + " , ����" + age;
		}
}
class Cat extends Animal { 			// Cat�� Animal ��� �Ϻθ� ����� ���
	
	Cat(String name, int age){
		super.name = name;
		super.age = age;		
	}
	
	@Override
	void cry() {
		System.out.println("����̴� �߿��ϰ� ���");
		
	}
	
	@Override
	void run() {
		System.out.println("����̴� �����ϰ� �ݴϴ�. ");
	}

	
}

class Tiger extends Animal { 		// Tiger�� Animal ��� ��� �� ��� , ��ũ��Ʈ Ŭ����

	Tiger(String name, int age){
		super.name = name;
		super.age = age;		
	}
	
	@Override
	void cry() {
		System.out.println("ȣ���̴� �����ϰ� ���");
	}

	@Override
	void run() {
		System.out.println("ȣ���̴� ������ �޸��ϴ�. ");
	}
	
}

class Eagle extends Animal {

	Eagle(String name, int age){
		super.name = name;
		super.age = age;		
	} 
	
	@Override
	void cry() {
		System.out.println("�������� �����ϰ� ���");
	}

	@Override
	void run() {
		System.out.println("�������� ������ ����");
	}
	
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������",15);
		
		// 1. Animal �迭 ��ü�� ���� �� 
		
		Animal[] arr1 = {a1,a2,a3};
		
		System.out.println("======== for �� ========================================");
		// 2. for ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� ��� , cry(), run()
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("�̸� : " + arr1[i].name + ", ���� : " + arr1[i].age);
			arr1[i].cry();
			arr1[i].run();
			System.out.println("======================");
		}
		System.out.println("======= ���� for �� =============================");
		// 3. Enhanced For ���� ����ؼ� �̸��� ���̸� ��� , cry(), run()
		for(Animal k : arr1) {
			System.out.println("�̸� : " + k.name + ", ���� : " + k.age);
			k.cry();
			k.run();
			System.out.println("======================");
		}
	}

}
