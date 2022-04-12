package Chap13.EX09;

// �Ű������� �޾Ƽ� ó�� : �������̽��� ������ Ŭ������ (X) 

interface A {
	void abc(); 			// public abstract
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		
		// 3. �������̽��� ������ Ŭ���� (X) + �������� ���� (O)
		A a = new A() {  			// �������̽��� ������ �ڽ� �͸� ��ü ���� �� Ÿ���� A�� ������ �������� ����
			@Override
			public void abc() {
				System.out.println("Ŭ���� (X) + �������� (O)");
			}
		};
		c.cde(a);
		
		// 4. �������̽��� ������ Ŭ���� (X) + �������� ���� (X)       < ======== ���� ���� ���(�ӽ÷� �ѹ��� ���)
				// �̺�Ʈ ó�� ���
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ���� (X) + �������� (X)");
			}
		});
		
		
		
	}

}
