package Chap12.EX06;

// Interface�� default �޼ҵ� : �������̽� ������ �����ΰ� �ִ� �޼ҵ�
	//public default void bcd () {}
		// Java 1.8 �̻󿡼� ���Ӱ� �߰��� ��� ..

	// default Ű�� �־�� �Ѵ�. default�� ���������ڰ� �ƴϴ�.


interface A {
	void abc(); 		// 2005�� ���� �޼ҵ� 		, public abstract�� ������, �����ΰ� ���� �߻� �޼ҵ�
	
	/*public*/ default void bcd() { 	// 2020�� ���� �޼ҵ�
		System.out.println("A �������̽��� bcd()");
	}
	//voit ttt(); 		// ���� Ŭ�������� ���ο� �߻�޼ҵ带 �߰��ϸ� ��ӵ� ��� ���� Ŭ������ �����߻�
}

class B implements A { 		// 2005�⿡ ������ �޼ҵ�
	public void abc() {
		System.out.println("B Ŭ������ abc()");
	}
}

class C implements A {  	// 2020�� ���� �޼ҵ�
	public void abc() {
		System.out.println("C Ŭ������ abc()");
	}
	public void bcd() { 			// default �޼ҵ嵵 �������̵� �� �� �ִ�.
		System.out.println("C Ŭ������ bcd()");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		// 1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		// 2. �޼ҵ� ȣ��
		a1.abc();
		a1.bcd();
		
		a2.abc();
		a2.bcd();
	}

}
