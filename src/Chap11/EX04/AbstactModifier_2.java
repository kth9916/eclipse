package Chap11.EX04;

// �߻� Ŭ������ ������� �ʴ� ��� :
	// �ڽ� Ŭ�������� �޽��� �������̵��� �������̵��� ��Ÿ�� ���� �߸� ������ �� �ִ�.

class Animal {
	void cry() {} 	// ������ cry() �������ְ� ������ �������� ����
}

class Cat extends Animal {
	void cry() { 				// �������̵��� �ƴ� �ڽ�Ŭ�������� ���ο� �޼ҵ�
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
	void cry() {			// �ڽĿ��� ���ο� �޼ҵ�
		System.out.println("�۸�");
	}
}

public class AbstactModifier_2 {

	public static void main(String[] args) {
		
		// 1. ��ü ���� 
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		// 2. �޼��� ȣ��
		a1.cry();
		a2.cry();
	}

}
