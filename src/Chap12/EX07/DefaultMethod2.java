package Chap12.EX07;

interface A { 		// �θ� �������̽�
	default void abc() { 		// �������̽��� �����ΰ� �ִ� �޼ҵ带 ���� : default
		System.out.println("A �������̽��� abc() ");
	}
}

class B /*extends object*/ implements A { 	  	// extends object�� ������	
	public void abc() { 		// �������̵�
		A.super.abc(); 			// super.abc object Ŭ������ abc() ȣ��
		System.out.println("B Ŭ������ abc() ");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {
		// 1. ��ü ����
		B b = new B();
		
		// 2. �޼ҵ� ȣ��
		b.abc(); // B�� abc()�� ȣ��
		
		System.out.println("======================");
		A a1 = new B(); 		// �������̽��� ��ü ������ �Ұ�, Ÿ���� ����
		a1.abc();
		
		
	}

}
