package chap18.EX06;

interface A{
	void abc(B b, int k); 		// �̹� ȣ���� �� b��� ��ü�� ���� ������
}

class B{
	void bcd(int k) { 				// �ν��Ͻ� �޼ҵ�
		System.out.println(k);
	}
}

public class RefOfInstanceMethod_Type_2_1 {

	public static void main(String[] args) {
		// �ν��Ͻ� �޼ҵ� ���� Type2
		// �͸� �̳�Ŭ����
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = (B b, int k) -> {b.bcd(k);};
		
		// �ν��Ͻ� �޼ҵ� ����
		A a3 = B::bcd; 				// <== �ν��Ͻ� �޼ҵ��̳� B��ü�� ��ǲ �޾Ƽ� bcd �޼ҵ� ȣ��
			// 1. ��ü��::�޼ҵ��;
			// B(�빮��) - ���� �޼ҵ� ȣ���� ��, �ν���Ʈ �޼ҵ� ȣ��������, �Ű������� ��ü�� ��ǲ ������ �� ��.
		
		B b = new B();
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
	}

}
