package chap18.EX09;

interface A{
	B abc(); 			// ����Ÿ���� B ��ü�� ����
}

class B{
	B(){
		System.out.println("ù ��° ������");
	}
	B(int k){
		System.out.println("�� ��° ������");
	}
}

public class RefOfClassConstructor_1 {

	public static void main(String[] args) {
		
		// 1. Ŭ���� ������ ����.
		// �͸� �̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc() { 			// abc() �޼ҵ� ȣ��� B ��ü�� �⺻ ������ ȣ�� ==> ������ ����.
				return new B();
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = () -> {return new B();}; 		// ��ü ����
		A a3 = () -> new B();			// return ���Ž� �߰�ȣ�� ����
		
		// Ŭ���� ������ ����
		A a4 = B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
		
		System.out.println("===========================");
		
		
	}

}
