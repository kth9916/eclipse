package chap18.EX04;

// ���ٽ��� Ȱ��
	// 1. �͸� �̳�Ŭ������ Ȱ���ϴ� ���
	// 2. �޼��� ���� (1. �ν��Ͻ� �޼ҵ� ����, 2. ���� �޼ҵ� ����) 
		// �޼ҵ� ���� : �����Ǿ� �ִ� �޼ҵ带 ����.
				// �޼ҵ� ������ ���ؼ��� ����Ÿ�԰� �Ű������� �����ؾ� �Ѵ�.

interface A{
	void abc();
}

class B{
	void bcd() { 		// �ν��Ͻ� �޼ҵ� : ��üȭ �ؾ� ȣ���� ����
		System.out.println("�ż���");
	}
}

public class RefOfInstanceMethod_Type_1 {

	public static void main(String[] args) {
		
		// 1. �ν��Ͻ� �޼��� ���� type 1 	<== �͸� �̳� Ŭ����
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		// 2. ���� �ó������� ���ٽ����� ǥ��
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		// 3. �ν��Ͻ� ���� ǥ���� type1
		B b = new B();		// �ν��Ͻ� ��ü�� ����, ��ü��::�޼ҵ��
		A a3 = b::bcd; 		// <== �ν��Ͻ� ���� ǥ�� <<== ���� Ÿ���� ���ƾ� �Ѵ�. �Ű������� �����ؾ� �Ѵ�.
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
	}

}